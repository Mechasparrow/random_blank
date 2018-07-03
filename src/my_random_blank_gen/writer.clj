(ns my-random-blank-gen.writer
  (:gen-class)
  (:require [clojure.data.json :as json]))

(defn write-to-json [list filename] ;; writes a list to a file
  (let [list-json (json/write-str list) path (str "data/" filename)]
    (spit path list-json)))
