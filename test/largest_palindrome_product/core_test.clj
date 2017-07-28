(ns largest-palindrome-product.core-test
  (:require [clojure.test :refer :all]
            [largest-palindrome-product.core :refer :all]))



(deftest palindrome?-test9009
 (testing "9009 is a palindrome"
    (is (true? (palindrome? "9009")))))

(deftest palindrome?-1001
 (testing "1001 is a palindrome"
     (is (true? (palindrome? 1001)))))

 (deftest palindrome?-10033001
  (testing "10033001 is a palindrome"
      (is (true? (palindrome? 10033001)))))

;;(run-tests 'largest-palindrome-product.core-test)
