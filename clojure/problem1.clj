; Multiples of 3 or 5 up to [limit]
; TODO: how to parametrize for arbitrary 3,5?
(defn multiples-of-3-or-5
      [limit]
      ; List comprehension: all elements of (range 1 limit) 
      ; where (mod 3 == 0 or mod 5 == 0)
      (for [x (range 1 limit)
            :when (or (= 0 (mod x 3)) (= 0 (mod x 5)))]
        x))

; Compute the sum
(reduce + (multiples-of-3-or-5 1000))
