.class public final Lvt1;
.super Ld2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final G:Lz00;

.field public final H:Lgt5;

.field public final I:Lxs1;


# direct methods
.method public constructor <init>(Lz00;Lgt5;I)V
    .locals 10

    .line 1
    iget-object v0, p1, Lz00;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lws1;

    .line 4
    .line 5
    iget-object v2, v0, Lws1;->a:Lkb4;

    .line 6
    .line 7
    iget-object v0, p1, Lz00;->c:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v3, v0

    .line 10
    check-cast v3, Lvj1;

    .line 11
    .line 12
    sget-object v4, Lme6;->x:Lqm;

    .line 13
    .line 14
    iget-object v0, p1, Lz00;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lvq4;

    .line 17
    .line 18
    iget v1, p2, Lgt5;->A:I

    .line 19
    .line 20
    invoke-static {v0, v1}, Lt49;->P(Lvq4;I)Luq4;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    iget-object v0, p2, Lgt5;->C:Lft5;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    sget-object v0, Lk28;->y:Lk28;

    .line 42
    .line 43
    :goto_0
    move-object v6, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-static {}, Lh;->c()V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0

    .line 50
    :cond_1
    sget-object v0, Lk28;->A:Lk28;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object v0, Lk28;->z:Lk28;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    iget-boolean v7, p2, Lgt5;->B:Z

    .line 57
    .line 58
    sget-object v9, Lpe2;->O:Lpe2;

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    move v8, p3

    .line 62
    invoke-direct/range {v1 .. v9}, Ld2;-><init>(Lkb4;Lvj1;Lrm;Luq4;Lk28;ZILpe2;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v1, Lvt1;->G:Lz00;

    .line 66
    .line 67
    iput-object p2, v1, Lvt1;->H:Lgt5;

    .line 68
    .line 69
    new-instance p0, Lxs1;

    .line 70
    .line 71
    new-instance p1, Lk3;

    .line 72
    .line 73
    const/16 p2, 0x13

    .line 74
    .line 75
    invoke-direct {p1, p2, v1}, Lk3;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v2, p1}, Lxs1;-><init>(Lkb4;Lsr2;)V

    .line 79
    .line 80
    .line 81
    iput-object p0, v1, Lvt1;->I:Lxs1;

    .line 82
    .line 83
    return-void
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
.method public final g1()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lvt1;->G:Lz00;

    .line 2
    .line 3
    iget-object v1, v0, Lz00;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lwv1;

    .line 6
    .line 7
    iget-object v2, p0, Lvt1;->H:Lgt5;

    .line 8
    .line 9
    invoke-static {v2, v1}, Lp25;->G(Lgt5;Lwv1;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lts1;->e(Lvj1;)Lfv3;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lfv3;->n()Lfu6;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    iget-object p0, v0, Lz00;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lbk7;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-static {v1, v2}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lbt5;

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Lbk7;->g(Lbt5;)Lvw3;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    return-object v0
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
.end method

.method public final getAnnotations()Lrm;
    .locals 0

    .line 1
    iget-object p0, p0, Lvt1;->I:Lxs1;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
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
.end method
