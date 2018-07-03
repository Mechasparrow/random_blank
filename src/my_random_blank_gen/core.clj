(ns my-random-blank-gen.core
  (:gen-class)
  (:require [my-random-blank-gen.prompts :as prompts]
            [my-random-blank-gen.generator :as generator]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do
    (println "Welcome to my random blank")
    (println "What would you like to do for random choice? (create/read)")
    (def ans (read-line))

    (def res-list (case ans
      "read" (println "readings")
      "create" (prompts/create-list-prompts)))
    (def rand-item (generator/random-item res-list))
    (println (str "the random item is " rand-item))))
    
