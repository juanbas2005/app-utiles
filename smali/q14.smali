.class public final Lq14;
.super Ld2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final G:Lam6;

.field public final H:Lm16;


# direct methods
.method public constructor <init>(Lam6;Lm16;ILxj1;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lam6;->x:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lpj3;

    .line 7
    .line 8
    iget-object v2, v0, Lpj3;->a:Lkb4;

    .line 9
    .line 10
    new-instance v4, Lu04;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v4, p1, p2, v1}, Lu04;-><init>(Lam6;Lci3;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p2, Lm16;->a:Ljava/lang/reflect/TypeVariable;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v9, v0, Lpj3;->m:Lpe2;

    .line 28
    .line 29
    sget-object v6, Lk28;->y:Lk28;

    .line 30
    .line 31
    move-object v1, p0

    .line 32
    move v8, p3

    .line 33
    move-object v3, p4

    .line 34
    invoke-direct/range {v1 .. v9}, Ld2;-><init>(Lkb4;Lvj1;Lrm;Luq4;Lk28;ZILpe2;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v1, Lq14;->G:Lam6;

    .line 38
    .line 39
    iput-object p2, v1, Lq14;->H:Lm16;

    .line 40
    .line 41
    return-void
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
.method public final f1(Ljava/util/List;)Ljava/util/List;
    .locals 11

    .line 1
    iget-object v3, p0, Lq14;->G:Lam6;

    .line 2
    .line 3
    iget-object v0, v3, Lam6;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lpj3;

    .line 6
    .line 7
    iget-object v6, v0, Lpj3;->r:Lhr2;

    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v10, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-static {p1, v0}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v7, v0

    .line 38
    check-cast v7, Lvw3;

    .line 39
    .line 40
    sget-object v0, Ll06;->O:Ll06;

    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-static {v7, v0, v1}, Liq7;->c(Lvw3;Lvr2;Lwv6;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    move-object v1, p0

    .line 53
    move-object v4, v6

    .line 54
    move-object v6, v7

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v0, Lu72;

    .line 57
    .line 58
    sget-object v4, Ljm;->B:Ljm;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v2, 0x0

    .line 62
    move-object v1, p0

    .line 63
    invoke-direct/range {v0 .. v5}, Lu72;-><init>(Lql;ZLam6;Ljm;Z)V

    .line 64
    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    const/4 v9, 0x0

    .line 68
    move-object v4, v6

    .line 69
    move-object v6, v7

    .line 70
    sget-object v7, La42;->w:La42;

    .line 71
    .line 72
    move-object v5, v0

    .line 73
    invoke-virtual/range {v4 .. v9}, Lhr2;->r(Lu72;Lvw3;Ljava/util/List;Lcp7;Z)Lvw3;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    if-nez v7, :cond_1

    .line 78
    .line 79
    :goto_1
    move-object v7, v6

    .line 80
    :cond_1
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-object p0, v1

    .line 84
    move-object v6, v4

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    return-object v10
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
.end method

.method public final g1()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lq14;->H:Lm16;

    .line 2
    .line 3
    iget-object v0, v0, Lm16;->a:Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    array-length v2, v0

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_0

    .line 22
    .line 23
    aget-object v5, v0, v4

    .line 24
    .line 25
    new-instance v6, La16;

    .line 26
    .line 27
    invoke-direct {v6, v5}, La16;-><init>(Ljava/lang/reflect/Type;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Ldt0;->S0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La16;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, v0, La16;->a:Ljava/lang/reflect/Type;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_1
    const-class v2, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v1, La42;->w:La42;

    .line 57
    .line 58
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, Lq14;->G:Lam6;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object p0, v2, Lam6;->x:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lpj3;

    .line 69
    .line 70
    iget-object p0, p0, Lpj3;->o:Lsl4;

    .line 71
    .line 72
    invoke-interface {p0}, Lsl4;->g()Lfv3;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Lfv3;->e()Lfu6;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iget-object v0, v2, Lam6;->x:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lpj3;

    .line 83
    .line 84
    iget-object v0, v0, Lpj3;->o:Lsl4;

    .line 85
    .line 86
    invoke-interface {v0}, Lsl4;->g()Lfv3;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lfv3;->p()Lfu6;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p0, v0}, Lkl8;->n(Lfu6;Lfu6;)Ldu7;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    const/16 v4, 0xa

    .line 106
    .line 107
    invoke-static {v1, v4}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, La16;

    .line 129
    .line 130
    iget-object v5, v2, Lam6;->A:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v5, Lwr0;

    .line 133
    .line 134
    sget-object v6, Lfq7;->x:Lfq7;

    .line 135
    .line 136
    const/4 v7, 0x3

    .line 137
    invoke-static {v6, v3, p0, v7}, Lsg3;->b0(Lfq7;ZLq14;I)Lwj3;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v5, v4, v6}, Lwr0;->h0(Ll16;Lwj3;)Lvw3;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    return-object v0
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
