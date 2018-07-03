(ns my-random-blank-gen.reader
  (:gen-class)
  (:require [clojure.data.json :as json]))


(defn get-file-input [filename mode]
  (try (do
    (println "getting file input")
    (if (= mode :raw)
     (slurp filename)
    (if (= mode :json)
      (let [json-data (get-file-input filename :raw)]
        (json/read-str json-data)))))
       (catch Exception e nil)))


(defn get-list-by-data [filename]
  (let [path (str "data/" filename)]
    (get-file-input path :json)))
