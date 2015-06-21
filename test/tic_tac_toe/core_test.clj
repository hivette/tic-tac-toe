(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

(deftest parse-loc-test
  (testing "it works"
    (is (= (parse-loc "1,2") [1,2]))
    (is (= (parse-loc "12,34") [12,34]))
    (is (= (parse-loc " 0 , 2 ") [0,2]))))

(deftest other-piece-test
  (testing "it works"
    (is (= (other-piece :x) :o))
    (is (= (other-piece :o) :x)))
  (testing "AssertionError is thrown if input is not :o or :x"
    (is (thrown? AssertionError (other-piece :e)))))
