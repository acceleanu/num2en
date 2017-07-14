(ns num2en-test
  (:use clojure.test)
  (:use num2en))

(deftest usage-test
  (is (= (num2en) "Usage: num2en <number>"))
)

