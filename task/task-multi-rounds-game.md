## Multi-round game tasking

十个round一局，所有球都扔完记录总得分：

- Given 十轮每一轮都没扔到， when 计算总分， then 总分为0；

- Given 十轮每一轮两球都没全倒，when计算总分，then 总分为所有倒球数；

- Given 存在一轮SPARE，非最后一轮，when计算总分， then 所得分数为每次扔球的倒瓶数总和再加SPARE轮后的一球的倒瓶数。

- Given 存在一轮STRIKE，非最后一轮，when计算总分， then 所得分数为每次扔球的倒瓶数总和再加STRIKE轮后两球的倒瓶数。

- Given 最后一轮SPARE，when计算总分， then 最后一轮加扔一球，所得分数为每次扔球的倒瓶数总和再加SPARE轮后的一球的倒瓶数。

- Given 最后一轮STRIKE，when计算总分， then 最后一轮加扔两球球，所得分数为每次扔球的倒瓶数总和再加SPARE轮后的一球的倒瓶数。
       
- Given 十轮均为STRIKE，且最后一轮加投也全中，when 计算总分， then所得分数300。