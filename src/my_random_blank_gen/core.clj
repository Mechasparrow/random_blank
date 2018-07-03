(ns my-random-blank-gen.core
  (:gen-class)
  (:require [my-random-blank-gen.prompts :as prompts]
            [my-random-blank-gen.generator :as generator]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [end-application (atom false)]
   (while (= @end-application false) (do
    (println "Welcome to my random blank")
    (println "What would you like to do for random choice? (create/read/exit)")
    (def ans (read-line))
    (if (= ans "exit") (do
                         (swap! end-application (fn [atm] true))
                         (println "exiting..."))
        (do 
    (def res-list (case ans
      "read" (prompts/list-read-prompt)
      "create" (prompts/create-list-prompts)
      nil))
    (def rand-item (generator/random-item res-list))
    (println (str "the random item is " rand-item))))))))
    
