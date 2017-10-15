(ns user
  (:require 
            [mount.core :as mount]
            [empty.figwheel :refer [start-fw stop-fw cljs]]
            empty.core))

(defn start []
  (mount/start-without #'empty.core/repl-server))

(defn stop []
  (mount/stop-except #'empty.core/repl-server))

(defn restart []
  (stop)
  (start))


