(ns function-lab.flow-control)

(defn check-guess
  [secret guess]
  (if (= secret guess)
    "You win!"
    (if (> secret guess)
      "Too low"
      "Too high")))

(defn check-guess-cond
  [secret guess]
  (cond
    (= secret guess) "You win!"
    (> secret guess) "Too low"
    :else "Too high"))

(defn numbers
  [n]
  (doseq [m (range n)]
    (println m)))

(defn print-bands
  [guitars basses drums]
  (doseq [g guitars
          b basses
          d drums]
    (println g b d)))


(defn all-bands
  [guitars basses drums]
  (for [g guitars
         b basses
         d drums]
    [ g b d]))

(defn fizz-buzz
  []
  (doseq [m (range 101)]
    (let [div3? (zero? (rem m 3))
          div5? (zero? (rem m 5))]
      (cond
        (and div3? div5?) (println "FizzBuzz")
        div3? (println "Fizz")
        div5? (println "Buzz")
        :else (println m)))))

(defn gcd
  [a b]
  (cond
    (zero? a) b
    (zero? b) a
    (> a b) (recur (- a b) b)
    :else (recur a (- b a))))
