(ns my-random-blank-gen.generator
  (:gen-class))


(defn random-idx [item-length]
  (rand-int item-length))

(defn random-item [items] ;; returns random item from list
  (let [item-array (to-array items)] (get items (random-idx (alength item-array)))))

