ROLLUP it is an extension of the GROUP BY clause.
It produces another row and shows the GRAND TOTAL (super-aggregate-value)


SELECT SUM(amount), order_date FROM transactions GROUP BY order_date WITH ROLLUP;




sum(amount)        order_date
10.00             2023-03-01
17.00             2023-03-02
15.00             2023-03-03
42.0 ---------------------------------------------> THIS IS WHAT ROLLUP PRODUCES. ROLLUP PRODUCES THE SUPER AGGREGAET



customer_id         amount        order_fate
1                    5.00        2023-03-01
2                    3.00        2023-03-01
3                    2.00        2023-03-01
4                    8.00        2023-03-02
5                    9.00        2023-03-02
6                    4.00        2023-03-03
7                    5.00        2023-03-03
8                    6.00        2023-03-03






















