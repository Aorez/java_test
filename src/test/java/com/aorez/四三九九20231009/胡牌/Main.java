package com.aorez.四三九九20231009.胡牌;

//产品经理小逸在繁忙的工作之余，想要找一种娱乐方式放松一下，于是他选择了国粹麻将。但是不同地区的不同游戏规则对他来说太过复杂，本着“适应不了规则就去修改规则”的心态，他自行发明了一种玩法规则，只留下一种花色，并且去除了一些特殊和牌的方式（例如七小对、十三幺等），新的规则如下：
//总共有36张牌，每张牌是1~9。每个数字4张牌。
//你手里有其中的14张牌，如果这14张牌满足如下条件，即算作和牌
//14张牌中有2张相同数字的牌，称为雀头。
//除去上述2张牌，剩下12张牌可以组成4个顺子或刻子。顺子的意思是递增的连续3个数字牌（例如234,567等），刻子的意思是相同数字的3个数字牌（例如111,777）
//例如：
//1 1 1 2 2 2 6 6 6 7 7 7 9 9 可以组成1,2,6,7的4个刻子和9的雀头，可以和牌
//1 1 1 1 2 2 3 3 5 6 7 7 8 9 用1做雀头，组123,123,567,789的四个顺子，可以和牌
//1 1 1 2 2 2 3 3 3 5 6 7 7 9 无论用1 2 3 7哪个做雀头，都无法组成和牌的条件。
//小逸从36张牌中抽取了13张手牌，他想知道在剩下的23张牌中，再取一张牌，取到哪几种数字牌可以和牌。
//输入描述:
//输入只有一行，包含13个数字，用空格分隔，每个数字在1~9之间，数据保证同种数字最多出现4次。
//输出描述:
//输出同样是一行，包含1个或以上的数字。代表他再取到哪些牌可以和牌。若满足条件的有多种牌，请按从小到大的顺序输出。若没有满足条件的牌，请输出一个数字0
//输入示例：1 1 1 2 2 2 5 5 5 6 6 6 9
//输出示例：9
//输入示例：1 1 1 1 2 2 3 3 5 6 7 8 9
//输出示例：4 7
//输入示例：1 1 1 2 2 2 3 3 3 5 7 7 9
//输出示例：0
public class Main {
    //nowcoder.ZJ20雀魂启动
}
