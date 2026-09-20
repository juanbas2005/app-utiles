.class public abstract Li52;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Llo7;

.field public static final b:Lx17;

.field public static final c:Lx17;

.field public static final d:Lx17;

.field public static final e:Lx17;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lce;->U:Lce;

    .line 2
    .line 3
    sget-object v1, Lce;->V:Lce;

    .line 4
    .line 5
    new-instance v2, Llo7;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Llo7;-><init>(Lvr2;Lvr2;)V

    .line 8
    .line 9
    .line 10
    sput-object v2, Li52;->a:Llo7;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    const/high16 v1, 0x43c80000    # 400.0f

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x5

    .line 17
    invoke-static {v0, v1, v2, v3}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    sput-object v4, Li52;->b:Lx17;

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sput-object v2, Li52;->c:Lx17;

    .line 28
    .line 29
    sget-object v2, Ll78;->a:Ljava/util/Map;

    .line 30
    .line 31
    new-instance v2, Loe3;

    .line 32
    .line 33
    const-wide v3, 0x100000001L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v3, v4}, Loe3;-><init>(J)V

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    invoke-static {v0, v1, v2, v5}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sput-object v2, Li52;->d:Lx17;

    .line 47
    .line 48
    new-instance v2, Lwe3;

    .line 49
    .line 50
    invoke-direct {v2, v3, v4}, Lwe3;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, v2, v5}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Li52;->e:Lx17;

    .line 58
    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public static final a(Lmm7;Lsr2;Lyt2;I)V
    .locals 7

    .line 1
    const v0, -0x46bdf1a6

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Lyt2;->g0(I)Lyt2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    and-int/lit8 v1, v0, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    move v1, v3

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v1, v4

    .line 40
    :goto_2
    and-int/2addr v0, v3

    .line 41
    invoke-virtual {p2, v0, v1}, Lyt2;->V(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_9

    .line 46
    .line 47
    iget-object v0, p0, Lmm7;->e:Led5;

    .line 48
    .line 49
    iget-object v1, p0, Lmm7;->d:Led5;

    .line 50
    .line 51
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v0, v3

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move v0, v4

    .line 60
    :goto_3
    iget-object v2, p0, Lmm7;->a:Lin8;

    .line 61
    .line 62
    invoke-virtual {v2}, Lin8;->H0()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v2, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    invoke-interface {p1}, Lsr2;->b()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    sget-object v5, Lay0;->a:Ld63;

    .line 86
    .line 87
    if-ne v2, v5, :cond_5

    .line 88
    .line 89
    new-array v2, v3, [Z

    .line 90
    .line 91
    aput-boolean v0, v2, v4

    .line 92
    .line 93
    invoke-virtual {p2, v2}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    check-cast v2, [Z

    .line 97
    .line 98
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-ne v6, v5, :cond_6

    .line 103
    .line 104
    new-array v6, v3, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {p2, v6}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    check-cast v6, [Ljava/lang/Object;

    .line 110
    .line 111
    aget-object v3, v6, v4

    .line 112
    .line 113
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {v3, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_8

    .line 122
    .line 123
    if-nez v0, :cond_7

    .line 124
    .line 125
    aget-boolean v3, v2, v4

    .line 126
    .line 127
    if-nez v3, :cond_7

    .line 128
    .line 129
    invoke-interface {p1}, Lsr2;->b()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    aput-object v1, v6, v4

    .line 137
    .line 138
    :cond_8
    aput-boolean v0, v2, v4

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_9
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 142
    .line 143
    .line 144
    :goto_4
    invoke-virtual {p2}, Lyt2;->v()Lyx5;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-eqz p2, :cond_a

    .line 149
    .line 150
    new-instance v0, Laf;

    .line 151
    .line 152
    invoke-direct {v0, p0, p1, p3}, Laf;-><init>(Lmm7;Lsr2;I)V

    .line 153
    .line 154
    .line 155
    iput-object v0, p2, Lyx5;->d:Lgs2;

    .line 156
    .line 157
    :cond_a
    return-void
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

.method public static b(Lje2;Lg80;I)Ln52;
    .locals 5

    .line 1
    sget-object v0, Lxb4;->M:Lg80;

    .line 2
    .line 3
    and-int/lit8 v1, p2, 0x1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object p0, Ll78;->a:Ljava/util/Map;

    .line 9
    .line 10
    new-instance p0, Lwe3;

    .line 11
    .line 12
    const-wide v3, 0x100000001L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v3, v4}, Lwe3;-><init>(J)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/high16 v3, 0x43c80000    # 400.0f

    .line 22
    .line 23
    invoke-static {v1, v3, p0, v2}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    move-object p1, v0

    .line 32
    :cond_1
    sget-object p2, Lxb4;->K:Lg80;

    .line 33
    .line 34
    invoke-static {p1, p2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    sget-object p1, Lxb4;->B:Li80;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    sget-object p1, Lxb4;->D:Li80;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    sget-object p1, Lxb4;->C:Li80;

    .line 53
    .line 54
    :goto_0
    new-instance p2, Lxc4;

    .line 55
    .line 56
    const/16 v0, 0x15

    .line 57
    .line 58
    invoke-direct {p2, v2, v0}, Lxc4;-><init>(II)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p0, p2}, Li52;->c(Ljb;Lje2;Lvr2;)Ln52;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
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

.method public static final c(Ljb;Lje2;Lvr2;)Ln52;
    .locals 8

    .line 1
    new-instance v0, Ln52;

    .line 2
    .line 3
    new-instance v1, Lnm7;

    .line 4
    .line 5
    new-instance v4, Lcn0;

    .line 6
    .line 7
    invoke-direct {v4, p0, p1, p2}, Lcn0;-><init>(Ljb;Lje2;Lvr2;)V

    .line 8
    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/16 v7, 0x7b

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Ln52;-><init>(Lnm7;)V

    .line 20
    .line 21
    .line 22
    return-object v0
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
.end method

.method public static d(Lje2;I)Ln52;
    .locals 4

    .line 1
    sget-object v0, Lxb4;->J:Lh80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr p1, v1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object p0, Ll78;->a:Ljava/util/Map;

    .line 8
    .line 9
    new-instance p0, Lwe3;

    .line 10
    .line 11
    const-wide v2, 0x100000001L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v2, v3}, Lwe3;-><init>(J)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    const/high16 v2, 0x43c80000    # 400.0f

    .line 21
    .line 22
    invoke-static {p1, v2, p0, v1}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    sget-object p1, Lxb4;->H:Lh80;

    .line 27
    .line 28
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget-object p1, Lxb4;->z:Li80;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    sget-object p1, Lxb4;->F:Li80;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p1, Lxb4;->C:Li80;

    .line 47
    .line 48
    :goto_0
    new-instance v0, Lxc4;

    .line 49
    .line 50
    const/16 v2, 0x16

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lxc4;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0, v0}, Li52;->c(Ljb;Lje2;Lvr2;)Ln52;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
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
.end method

.method public static e(Lje2;I)Ln52;
    .locals 8

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/high16 p0, 0x43c80000    # 400.0f

    .line 7
    .line 8
    const/4 p1, 0x5

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, p1}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    new-instance p1, Ln52;

    .line 15
    .line 16
    new-instance v1, Lnm7;

    .line 17
    .line 18
    new-instance v2, Lgb2;

    .line 19
    .line 20
    invoke-direct {v2, v0, p0}, Lgb2;-><init>(FLje2;)V

    .line 21
    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/16 v7, 0x7e

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v1}, Ln52;-><init>(Lnm7;)V

    .line 33
    .line 34
    .line 35
    return-object p1
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
.end method

.method public static f(Lje2;I)Lx82;
    .locals 8

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/high16 p0, 0x43c80000    # 400.0f

    .line 7
    .line 8
    const/4 p1, 0x5

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, p1}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    new-instance p1, Lx82;

    .line 15
    .line 16
    new-instance v1, Lnm7;

    .line 17
    .line 18
    new-instance v2, Lgb2;

    .line 19
    .line 20
    invoke-direct {v2, v0, p0}, Lgb2;-><init>(FLje2;)V

    .line 21
    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/16 v7, 0x7e

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v1}, Lx82;-><init>(Lnm7;)V

    .line 33
    .line 34
    .line 35
    return-object p1
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
.end method

.method public static g(Lje2;Lg80;I)Lx82;
    .locals 5

    .line 1
    sget-object v0, Lxb4;->M:Lg80;

    .line 2
    .line 3
    and-int/lit8 v1, p2, 0x1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object p0, Ll78;->a:Ljava/util/Map;

    .line 9
    .line 10
    new-instance p0, Lwe3;

    .line 11
    .line 12
    const-wide v3, 0x100000001L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v3, v4}, Lwe3;-><init>(J)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/high16 v3, 0x43c80000    # 400.0f

    .line 22
    .line 23
    invoke-static {v1, v3, p0, v2}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    move-object p1, v0

    .line 32
    :cond_1
    sget-object p2, Lxb4;->K:Lg80;

    .line 33
    .line 34
    invoke-static {p1, p2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    sget-object p1, Lxb4;->B:Li80;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    sget-object p1, Lxb4;->D:Li80;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    sget-object p1, Lxb4;->C:Li80;

    .line 53
    .line 54
    :goto_0
    new-instance p2, Lxc4;

    .line 55
    .line 56
    const/16 v0, 0x17

    .line 57
    .line 58
    invoke-direct {p2, v2, v0}, Lxc4;-><init>(II)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p0, p2}, Li52;->h(Ljb;Lje2;Lvr2;)Lx82;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
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

.method public static final h(Ljb;Lje2;Lvr2;)Lx82;
    .locals 8

    .line 1
    new-instance v0, Lx82;

    .line 2
    .line 3
    new-instance v1, Lnm7;

    .line 4
    .line 5
    new-instance v4, Lcn0;

    .line 6
    .line 7
    invoke-direct {v4, p0, p1, p2}, Lcn0;-><init>(Ljb;Lje2;Lvr2;)V

    .line 8
    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/16 v7, 0x7b

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lx82;-><init>(Lnm7;)V

    .line 20
    .line 21
    .line 22
    return-object v0
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
.end method

.method public static i(Lje2;I)Lx82;
    .locals 4

    .line 1
    sget-object v0, Lxb4;->J:Lh80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr p1, v1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object p0, Ll78;->a:Ljava/util/Map;

    .line 8
    .line 9
    new-instance p0, Lwe3;

    .line 10
    .line 11
    const-wide v2, 0x100000001L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v2, v3}, Lwe3;-><init>(J)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    const/high16 v2, 0x43c80000    # 400.0f

    .line 21
    .line 22
    invoke-static {p1, v2, p0, v1}, Lkl8;->M(FFLjava/lang/Object;I)Lx17;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    sget-object p1, Lxb4;->H:Lh80;

    .line 27
    .line 28
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget-object p1, Lxb4;->z:Li80;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    sget-object p1, Lxb4;->F:Li80;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p1, Lxb4;->C:Li80;

    .line 47
    .line 48
    :goto_0
    new-instance v0, Lxc4;

    .line 49
    .line 50
    const/16 v2, 0x18

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lxc4;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0, v0}, Li52;->h(Ljb;Lje2;Lvr2;)Lx82;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
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
.end method

.method public static final j(Lje2;Lvr2;)Ln52;
    .locals 8

    .line 1
    new-instance v0, Lh52;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Lh52;-><init>(ILvr2;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ln52;

    .line 8
    .line 9
    new-instance v1, Lnm7;

    .line 10
    .line 11
    new-instance v3, Ldv6;

    .line 12
    .line 13
    invoke-direct {v3, p0, v0}, Ldv6;-><init>(Lje2;Lvr2;)V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/16 v7, 0x7d

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v1}, Ln52;-><init>(Lnm7;)V

    .line 26
    .line 27
    .line 28
    return-object p1
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
.end method

.method public static final k(Lje2;Lvr2;)Lx82;
    .locals 8

    .line 1
    new-instance v0, Lh52;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p1}, Lh52;-><init>(ILvr2;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lx82;

    .line 8
    .line 9
    new-instance v1, Lnm7;

    .line 10
    .line 11
    new-instance v3, Ldv6;

    .line 12
    .line 13
    invoke-direct {v3, p0, v0}, Ldv6;-><init>(Lje2;Lvr2;)V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/16 v7, 0x7d

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v1}, Lx82;-><init>(Lnm7;)V

    .line 26
    .line 27
    .line 28
    return-object p1
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
.end method
