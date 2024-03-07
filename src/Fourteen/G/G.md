试题 Fourteen.G: 买二赠一
【问题描述】
某商场有 N 件商品，其中第 i 件的价格是 Ai。
现在该商场正在进行 “买二 赠一” 的优惠活动，
具体规则是： 每购买 2 件商品，假设其中较便宜的价格是 P（如果两件商品价格一样， 
则 P 等于其中一件商品的价格），就可以从剩余商品中任选一件价格不超过 P/2的商品，
免费获得这一件商品。可以通过反复购买 2 件商品来获得多件免费商品，但是每件商品只能被购买或免费获得一次。 
小明想知道如果要拿下所有商品（包含购买和免费获得），至少要花费多少 钱？
【输入格式】
第一行包含一个整数 N。 第二行包含 N 个整数，代表 A1, A2, A3, . . . ，AN。
【输出格式】
输出一个整数，代表答案。
【样例输入】
7
1 4 2 8 5 7 1
【样例输出】
25
【样例说明】
小明可以先购买价格 4 和 8 的商品，免费获得一件价格为 1 的商品；
再后 买价格为 5 和 7 的商品，免费获得价格为 2 的商品；最后单独购买剩下的一件 价格为 1 的商品。
总计花费 4 + 8 + 5 + 7 + 1 = 25。不存在花费更低的方案。
【思路分析】
我们每次购买时，先购买此时最大的和次大的商品，然后我们就可以得到一个较大的免费机会，
然后将这个免费机会放入一个队列中，再下一次购买商品时，判断是否能够免费获得商品。
提示：用于获得免费机会的两个商品，必须支付现金，不能对这两个商品使用免费机会。