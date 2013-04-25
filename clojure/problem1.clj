(defn multiples-of-3-or-5
      [limit]
      (for [x (range 1 limit)
            :when (or (= 0 (mod x 3)) (= 0 (mod x 5)))]
        x))

(reduce + (multiples-of-3-or-5 1000))
