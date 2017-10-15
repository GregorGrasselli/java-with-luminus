(ns empty.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [empty.core-test]))

(doo-tests 'empty.core-test)

