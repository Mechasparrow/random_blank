(ns my-random-blank-gen.prompts
  (:gen-class))

(defn create-list-prompts [];; Creating a list by prompts
  (do
    (println "creating list")
    (print "what is the length: ")
    (flush)
    (def list-length (Integer/parseInt (read-line)))
    (println)
    (let [i (atom 0) items (atom [])]
      (do (while (< @i list-length)
        (do
          (print (+ @i 1))
          (print ")")
          (flush)
          (swap! i inc)
          (swap! items (fn [arr] (conj arr (read-line))))
          (println)))
          @items))))

