(ns ^:figwheel-no-load empty.app
  (:require [empty.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
