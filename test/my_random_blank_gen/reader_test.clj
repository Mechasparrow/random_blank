(ns my-random-blank-gen.reader-test
  (:require [clojure.test :refer :all]
            [my-random-blank-gen.reader :refer :all]
            [clojure.java.io :refer :all]))

(deftest file-test-one
  (testing "raw file reading"
    (let [output (get-file-input "test/test_data/test.json" :raw) real (slurp "test/test_data/test.json")]
      (is (= output real)))))

(deftest file-test-json
  (testing "json parsed reading test")
    (is (= (get-file-input "test/test_data/test.json" :json) {"hello" "world"}))) ;; will fail
