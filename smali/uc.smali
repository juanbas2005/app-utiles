.class public final Luc;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public A:I

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:Lvc;

.field public final synthetic D:Le06;

.field public final synthetic E:F


# direct methods
.method public constructor <init>(Lvc;Le06;FLf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luc;->C:Lvc;

    .line 2
    .line 3
    iput-object p2, p0, Luc;->D:Le06;

    .line 4
    .line 5
    iput p3, p0, Luc;->E:F

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p4}, La97;-><init>(ILf61;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Luc;->A:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Luc;->B:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Le06;

    .line 12
    .line 13
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Luc;->B:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lad;

    .line 29
    .line 30
    new-instance v0, Ltc;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iget-object v4, p0, Luc;->C:Lvc;

    .line 34
    .line 35
    invoke-direct {v0, v3, v4, p1}, Ltc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v4, Lvc;->h0:Leh2;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Luc;->D:Le06;

    .line 43
    .line 44
    iput-object v1, p0, Luc;->B:Ljava/lang/Object;

    .line 45
    .line 46
    iput v2, p0, Luc;->A:I

    .line 47
    .line 48
    iget v2, p0, Luc;->E:F

    .line 49
    .line 50
    invoke-interface {p1, v0, v2, p0}, Leh2;->a(Leh6;FLf61;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object p0, Lp81;->w:Lp81;

    .line 55
    .line 56
    if-ne p1, p0, :cond_2

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    move-object p0, v1

    .line 60
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, p0, Le06;->w:F

    .line 67
    .line 68
    sget-object p0, Lvs7;->a:Lvs7;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_3
    const-string p0, "resolvedFlingBehavior"

    .line 72
    .line 73
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1
.end method

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lad;

    .line 2
    .line 3
    check-cast p2, Lll1;

    .line 4
    .line 5
    check-cast p3, Lf61;

    .line 6
    .line 7
    new-instance p2, Luc;

    .line 8
    .line 9
    iget-object v0, p0, Luc;->D:Le06;

    .line 10
    .line 11
    iget v1, p0, Luc;->E:F

    .line 12
    .line 13
    iget-object p0, p0, Luc;->C:Lvc;

    .line 14
    .line 15
    invoke-direct {p2, p0, v0, v1, p3}, Luc;-><init>(Lvc;Le06;FLf61;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p2, Luc;->B:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object p0, Lvs7;->a:Lvs7;

    .line 21
    .line 22
    invoke-virtual {p2, p0}, Luc;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
