(ns function-lab.core)

(defn greet
  []
  (println "Hello"))

(def greet-anon (fn [] (println "Hello")))

(def greet-anon2 #(println "Hello"))


(defn greeting
  ([]
   (greeting "Hello" "World"))
  ([x]
   (greeting "Hello" x))
  ([x y]
   (str x ", " y "!")))

(defn do-nothing
  [x]
  x)

(defn always-thing
  [& args]
  :thing)

(defn make-thingy
  [x]
  (fn [& args] x))

(defn triplicate
  [f]
  (dotimes [n 3] (f)))

(defn opposite
  [f]
  (fn [& args] (not (apply f args))))

(defn triplicate2
  [f & args]
  (triplicate f) args)
