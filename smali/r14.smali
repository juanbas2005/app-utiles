.class public final Lr14;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lup7;


# instance fields
.field public A:Ljava/lang/Object;

.field public w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public z:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lam6;Lxj1;Lyj3;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lr14;->x:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lr14;->y:Ljava/lang/Object;

    .line 13
    .line 14
    iput p4, p0, Lr14;->w:I

    .line 15
    .line 16
    invoke-interface {p3}, Lyj3;->getTypeParameters()Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p3, 0x0

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    if-eqz p4, :cond_0

    .line 35
    .line 36
    add-int/lit8 p4, p3, 0x1

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move p3, p4

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p2, p0, Lr14;->z:Ljava/io/Serializable;

    .line 52
    .line 53
    iget-object p1, p0, Lr14;->x:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lam6;

    .line 56
    .line 57
    iget-object p1, p1, Lam6;->x:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lpj3;

    .line 60
    .line 61
    iget-object p1, p1, Lpj3;->a:Lkb4;

    .line 62
    .line 63
    new-instance p2, Lb0;

    .line 64
    .line 65
    const/16 p3, 0x17

    .line 66
    .line 67
    invoke-direct {p2, p3, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lkb4;->c(Lvr2;)Lm70;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lr14;->A:Ljava/lang/Object;

    .line 75
    .line 76
    return-void
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

.method public constructor <init>(Leu4;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr14;->x:Ljava/lang/Object;

    .line 78
    new-instance p1, Lcz6;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcz6;-><init>(I)V

    iput-object p1, p0, Lr14;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)Lqt4;
    .locals 3

    .line 1
    iget-object v0, p0, Lr14;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Leu4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {p0, p1, v0, v2, v1}, Lr14;->c(ILqt4;Lqt4;Z)Lqt4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public b(Ljava/lang/String;Z)Lqt4;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr14;->y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lcz6;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Le2;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, v2, v0}, Le2;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcl6;->O(Ljava/util/Iterator;)Lal6;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lg21;

    .line 22
    .line 23
    invoke-virtual {v0}, Lg21;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v3, v1

    .line 39
    check-cast v3, Lqt4;

    .line 40
    .line 41
    iget-object v4, v3, Lqt4;->x:Lao;

    .line 42
    .line 43
    iget-object v4, v4, Lao;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static {v4, p1, v5}, Lk57;->n0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    iget-object v3, v3, Lqt4;->x:Lao;

    .line 55
    .line 56
    invoke-virtual {v3, p1}, Lao;->e(Ljava/lang/String;)Lpt4;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move-object v1, v2

    .line 64
    :cond_2
    :goto_0
    check-cast v1, Lqt4;

    .line 65
    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    iget-object p0, p0, Lr14;->x:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Leu4;

    .line 73
    .line 74
    iget-object p0, p0, Lqt4;->y:Leu4;

    .line 75
    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    iget-object p0, p0, Leu4;->B:Lr14;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_3
    const/4 p2, 0x1

    .line 91
    invoke-virtual {p0, p1, p2}, Lr14;->b(Ljava/lang/String;Z)Lqt4;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_4
    return-object v2

    .line 97
    :cond_5
    return-object v1
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
.end method

.method public c(ILqt4;Lqt4;Z)Lqt4;
    .locals 5

    .line 1
    iget-object v0, p0, Lr14;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Leu4;

    .line 4
    .line 5
    iget-object p0, p0, Lr14;->y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcz6;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcz6;->c(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lqt4;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-static {v1, p3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    iget-object v3, v1, Lqt4;->y:Leu4;

    .line 25
    .line 26
    iget-object v4, p3, Lqt4;->y:Leu4;

    .line 27
    .line 28
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_0
    move-object v1, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_2
    :goto_0
    if-eqz p4, :cond_6

    .line 41
    .line 42
    new-instance v1, Le2;

    .line 43
    .line 44
    const/4 v3, 0x3

    .line 45
    invoke-direct {v1, v3, p0}, Le2;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Lcl6;->O(Ljava/util/Iterator;)Lal6;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lg21;

    .line 53
    .line 54
    invoke-virtual {p0}, Lg21;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Lqt4;

    .line 69
    .line 70
    instance-of v3, v1, Leu4;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1, p2}, Lqt4;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    check-cast v1, Leu4;

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    iget-object v1, v1, Leu4;->B:Lr14;

    .line 84
    .line 85
    invoke-virtual {v1, p1, v0, p3, v3}, Lr14;->c(ILqt4;Lqt4;Z)Lqt4;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object v1, v2

    .line 91
    :goto_1
    if-eqz v1, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    move-object v1, v2

    .line 95
    :cond_6
    :goto_2
    if-nez v1, :cond_8

    .line 96
    .line 97
    iget-object p0, v0, Lqt4;->y:Leu4;

    .line 98
    .line 99
    if-eqz p0, :cond_7

    .line 100
    .line 101
    invoke-virtual {p0, p2}, Leu4;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_7

    .line 106
    .line 107
    iget-object p0, v0, Lqt4;->y:Leu4;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, Leu4;->B:Lr14;

    .line 113
    .line 114
    invoke-virtual {p0, p1, v0, p3, p4}, Lr14;->c(ILqt4;Lqt4;Z)Lqt4;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_7
    return-object v2

    .line 120
    :cond_8
    return-object v1
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

.method public d(Lm16;)Lqp7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr14;->A:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lm70;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm70;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lq14;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object p0, p0, Lr14;->x:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lam6;

    .line 20
    .line 21
    iget-object p0, p0, Lam6;->y:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lup7;

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lup7;->d(Lm16;)Lqp7;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public e(Lpt4;Lcf4;ZLqt4;)Lpt4;
    .locals 5

    .line 1
    iget-object p0, p0, Lr14;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Leu4;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Leu4;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    move-object v2, v1

    .line 15
    check-cast v2, Lgu4;

    .line 16
    .line 17
    invoke-virtual {v2}, Lgu4;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2}, Lgu4;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lqt4;

    .line 29
    .line 30
    invoke-static {v2, p4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, p2}, Lqt4;->k(Lcf4;)Lpt4;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    :cond_1
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {v0}, Ldt0;->I0(Ljava/util/ArrayList;)Ljava/lang/Comparable;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lpt4;

    .line 51
    .line 52
    iget-object v1, p0, Lqt4;->y:Leu4;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    if-eqz p3, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1, p4}, Leu4;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-nez p3, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1, p2, p0}, Leu4;->l(Lcf4;Lqt4;)Lpt4;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :cond_3
    filled-new-array {p1, v0, v4}, [Lpt4;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lqs;->V0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Ldt0;->I0(Ljava/util/ArrayList;)Ljava/lang/Comparable;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lpt4;

    .line 81
    .line 82
    return-object p0
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

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr14;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Leu4;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, v0, Lqt4;->x:Lao;

    .line 10
    .line 11
    iget-object v1, v1, Lao;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    sget v0, Lqt4;->A:I

    .line 28
    .line 29
    const-string v0, "android-app://androidx.navigation/"

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :goto_0
    iput v0, p0, Lr14;->w:I

    .line 40
    .line 41
    iput-object p1, p0, Lr14;->A:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p0, "Cannot have an empty start destination route"

    .line 45
    .line 46
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    const-string p0, "Start destination "

    .line 51
    .line 52
    const-string v1, " cannot use the same route as the graph "

    .line 53
    .line 54
    invoke-static {p0, p1, v1, v0}, Lku4;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
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
