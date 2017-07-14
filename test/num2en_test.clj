(ns num2en-test
  (:use clojure.test)
  (:use num2en))

(deftest usage-test
  (is (= (num2en) "Usage: num2en <number>"))
)

(deftest convert-numbers-0-19-test
  (is (= (num2en 0) "zero"))
  (is (= (num2en 1) "one"))
  ;(is (= (num2en 2) "two"))
  ;(is (= (num2en 3) "three"))
  ;(is (= (num2en 4) "four"))
  ;(is (= (num2en 5) "five"))
  ;(is (= (num2en 6) "six"))
  ;(is (= (num2en 7) "seven"))
  ;(is (= (num2en 8) "eight"))
  ;(is (= (num2en 9) "nine"))
  ;(is (= (num2en 10) "ten"))
  )