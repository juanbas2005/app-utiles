.class public final Lu04;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lrm;


# instance fields
.field public final w:Lam6;

.field public final x:Lci3;

.field public final y:Z

.field public final z:Lm70;


# direct methods
.method public constructor <init>(Lam6;Lci3;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lu04;->w:Lam6;

    .line 11
    .line 12
    iput-object p2, p0, Lu04;->x:Lci3;

    .line 13
    .line 14
    iput-boolean p3, p0, Lu04;->y:Z

    .line 15
    .line 16
    iget-object p1, p1, Lam6;->x:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lpj3;

    .line 19
    .line 20
    iget-object p1, p1, Lpj3;->a:Lkb4;

    .line 21
    .line 22
    new-instance p2, Lb0;

    .line 23
    .line 24
    const/16 p3, 0x14

    .line 25
    .line 26
    invoke-direct {p2, p3, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lkb4;->c(Lvr2;)Lm70;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lu04;->z:Lm70;

    .line 34
    .line 35
    return-void
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


# virtual methods
.method public final bridge i(Lup2;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lgw8;->y(Lrm;Lup2;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lu04;->x:Lci3;

    .line 2
    .line 3
    invoke-interface {p0}, Lci3;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    iget-object v0, p0, Lu04;->x:Lci3;

    .line 2
    .line 3
    invoke-interface {v0}, Lci3;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v1}, Ldt0;->o0(Ljava/lang/Iterable;)Lts;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lu04;->z:Lm70;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v3, Lwl7;

    .line 19
    .line 20
    invoke-direct {v3, v1, v2}, Lwl7;-><init>(Lal6;Lvr2;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lbi3;->a:Luq4;

    .line 24
    .line 25
    sget-object v1, Lm27;->m:Lup2;

    .line 26
    .line 27
    iget-object p0, p0, Lu04;->w:Lam6;

    .line 28
    .line 29
    invoke-static {v1, v0, p0}, Lbi3;->a(Lup2;Lci3;Lam6;)Lwl5;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v0, Lts;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    invoke-direct {v0, v1, p0}, Lts;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    new-array p0, p0, [Lal6;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    aput-object v3, p0, v1

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    aput-object v0, p0, v2

    .line 47
    .line 48
    invoke-static {p0}, Lqs;->E0([Ljava/lang/Object;)Lal6;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lcl6;->Q(Lal6;)Lxg2;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance v0, Lnf6;

    .line 57
    .line 58
    const/16 v2, 0x12

    .line 59
    .line 60
    invoke-direct {v0, v2}, Lnf6;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Lae2;

    .line 64
    .line 65
    invoke-direct {v2, p0, v1, v0}, Lae2;-><init>(Lal6;ZLvr2;)V

    .line 66
    .line 67
    .line 68
    new-instance p0, Lzd2;

    .line 69
    .line 70
    invoke-direct {p0, v2}, Lzd2;-><init>(Lae2;)V

    .line 71
    .line 72
    .line 73
    return-object p0
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
.end method

.method public final m(Lup2;)Lfm;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu04;->x:Lci3;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lci3;->a(Lup2;)Ln06;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lu04;->z:Lm70;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lm70;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lfm;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v1

    .line 24
    :cond_1
    :goto_0
    sget-object v1, Lbi3;->a:Luq4;

    .line 25
    .line 26
    iget-object p0, p0, Lu04;->w:Lam6;

    .line 27
    .line 28
    invoke-static {p1, v0, p0}, Lbi3;->a(Lup2;Lci3;Lam6;)Lwl5;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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
.end method
