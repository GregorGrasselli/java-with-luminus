(ns empty.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [empty.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[empty started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[empty has shut down successfully]=-"))
   :middleware wrap-dev})
