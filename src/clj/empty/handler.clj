(ns empty.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [empty.layout :refer [error-page]]
            [empty.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [empty.env :refer [defaults]]
            [mount.core :as mount]
            [empty.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
