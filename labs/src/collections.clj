(ns function-lab.collections)

(def scores {"Una" 1400 "Bob" 1240 "Cid" 1024})

                                        ; (assoc scores "Mel" 23)

(def player {:name "Una" :ranking 43})

(get player :ranking)
(:ranking player)
(player :ranking)

(def game
  {:round 2
   :players #{{:name "Una" :ranking 43}
              {:name "Bob" :ranking 77}
              {:name "Cid" :ranking 33}}
   :scores {"Una" 1400
            "Bob" 1240
            "Cid" 1024}})

(defn next-round [m]
  (update-in game [:round] inc))

(defn add-score
  [player game]
  (update-in game [:players] ))
