; Fibonacci numbers as lazy sequence
; Taken from http://clojuredocs.org/clojure_core/clojure.core/lazy-seq
; Added parameter matching
(defn fibonacci
      ([] (fibonacci 1 1))
      ([a b] (cons a (lazy-seq (fibonacci b (+ b a))))))

; List containing even Fibonacci numbers below 4 million
(def even-fibs-below-4m (for [x (fibonacci)
                              :while (< x 4e6)
                              :when (= 0 (mod x 2))]
                          x))

; Compute sum
(reduce + even-fibs-below-4m)

