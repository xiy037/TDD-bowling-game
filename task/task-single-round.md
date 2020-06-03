## Single-round tasking

这里的一个round表示一轮，十轮组成一局。先对round进行task and test，然后通过测试后对一个完成局进行task和测试。
（否则直接十轮不好test），最后一轮的round作为特殊案例，将在game中体现。这里考虑的是在第十轮之前的一般情况。


- Given 第一球就strike， when 在一轮中可以扔两球，记录得分，then 本round得分为十分加接下来两球得分。

- Given 第一球没有strike，第二球将剩下的球全打到， when 在一轮中可以扔两球，记录得分，then 本round得分为十分加接下来一球得分。

- Given 两球相加都没有全倒， when 在一轮中扔两球，记录得分，then 本round得分为总倒球数。