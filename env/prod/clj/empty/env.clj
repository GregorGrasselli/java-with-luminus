(ns empty.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[empty started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[empty has shut down successfully]=-"))
   :middleware identity})
