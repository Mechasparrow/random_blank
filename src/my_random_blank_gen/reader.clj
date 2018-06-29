(ns my-random-blank-gen.reader
  (:gen-class)
  (:require [clojure.data.json :as json]))

(defn get-file-input [filename mode]
  (do
    (println "getting file input")
    (if (= mode :raw)
     (slurp filename)
    (if (= mode :json)
      (let [json-data (get-file-input filename :raw)]
        (json/read-str json-data))))))
