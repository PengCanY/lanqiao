试题 Fourteen.D: 矩形总面积
平面上有个两个矩形 R1 和 R2，它们各边都与坐标轴平行。设 (x1, y1) 和
(x2, y2) 依次是 R1 的左下角和右上角坐标，(x3, y3) 和 (x4, y4) 依次是 R2 的左下 角和右上角坐标，
请你计算 R1 和 R2 的总面积是多少？ 注意：如果 R1 和 R2 有重叠区域，重叠区域的面积只计算一次。
【输出格式】
一个整数，代表答案
【输入格式】
输入只有一行，包含 8 个整数，依次是：x1，y1，x2，y2，x3，y3，x4 和 y4。
[思路解析】
先计算两个矩形的面积，然后将其相加，
如果重叠然后就减去重叠区域的面积，否则直接返回，所以需要写一个判断是否重叠的函数，此时求他们在x轴和y轴上的交集。