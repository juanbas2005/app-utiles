.class public final Lq3;
.super Ln3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final y:Lpe2;

.field public final synthetic z:Lr3;


# direct methods
.method public constructor <init>(Lr3;Lkb4;Lpe2;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lq3;->z:Lr3;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ln3;-><init>(Lkb4;)V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Lq3;->y:Lpe2;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    invoke-static {p0}, Lq3;->i(I)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
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
.end method

.method public static synthetic i(I)V
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    if-eq p0, v5, :cond_0

    .line 9
    .line 10
    if-eq p0, v4, :cond_0

    .line 11
    .line 12
    if-eq p0, v3, :cond_0

    .line 13
    .line 14
    if-eq p0, v2, :cond_0

    .line 15
    .line 16
    if-eq p0, v1, :cond_0

    .line 17
    .line 18
    if-eq p0, v0, :cond_0

    .line 19
    .line 20
    const-string v6, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v6, "@NotNull method %s.%s must not return null"

    .line 24
    .line 25
    :goto_0
    if-eq p0, v5, :cond_1

    .line 26
    .line 27
    if-eq p0, v4, :cond_1

    .line 28
    .line 29
    if-eq p0, v3, :cond_1

    .line 30
    .line 31
    if-eq p0, v2, :cond_1

    .line 32
    .line 33
    if-eq p0, v1, :cond_1

    .line 34
    .line 35
    if-eq p0, v0, :cond_1

    .line 36
    .line 37
    move v7, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v7, v4

    .line 40
    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    .line 41
    .line 42
    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor"

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    packed-switch p0, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const-string v10, "storageManager"

    .line 49
    .line 50
    aput-object v10, v7, v9

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :pswitch_0
    const-string v10, "classifier"

    .line 54
    .line 55
    aput-object v10, v7, v9

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :pswitch_1
    const-string v10, "supertypes"

    .line 59
    .line 60
    aput-object v10, v7, v9

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :pswitch_2
    const-string v10, "type"

    .line 64
    .line 65
    aput-object v10, v7, v9

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :pswitch_3
    aput-object v8, v7, v9

    .line 69
    .line 70
    :goto_2
    const-string v9, "processSupertypesWithoutCycles"

    .line 71
    .line 72
    if-eq p0, v5, :cond_7

    .line 73
    .line 74
    if-eq p0, v4, :cond_6

    .line 75
    .line 76
    if-eq p0, v3, :cond_5

    .line 77
    .line 78
    if-eq p0, v2, :cond_4

    .line 79
    .line 80
    if-eq p0, v1, :cond_3

    .line 81
    .line 82
    if-eq p0, v0, :cond_2

    .line 83
    .line 84
    aput-object v8, v7, v5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    aput-object v9, v7, v5

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const-string v8, "getSupertypeLoopChecker"

    .line 91
    .line 92
    aput-object v8, v7, v5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    const-string v8, "getBuiltIns"

    .line 96
    .line 97
    aput-object v8, v7, v5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    const-string v8, "getDeclarationDescriptor"

    .line 101
    .line 102
    aput-object v8, v7, v5

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    const-string v8, "getParameters"

    .line 106
    .line 107
    aput-object v8, v7, v5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    const-string v8, "computeSupertypes"

    .line 111
    .line 112
    aput-object v8, v7, v5

    .line 113
    .line 114
    :goto_3
    packed-switch p0, :pswitch_data_1

    .line 115
    .line 116
    .line 117
    const-string v8, "<init>"

    .line 118
    .line 119
    aput-object v8, v7, v4

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :pswitch_4
    const-string v8, "isSameClassifier"

    .line 123
    .line 124
    aput-object v8, v7, v4

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :pswitch_5
    aput-object v9, v7, v4

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :pswitch_6
    const-string v8, "reportSupertypeLoopError"

    .line 131
    .line 132
    aput-object v8, v7, v4

    .line 133
    .line 134
    :goto_4
    :pswitch_7
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    if-eq p0, v5, :cond_8

    .line 139
    .line 140
    if-eq p0, v4, :cond_8

    .line 141
    .line 142
    if-eq p0, v3, :cond_8

    .line 143
    .line 144
    if-eq p0, v2, :cond_8

    .line 145
    .line 146
    if-eq p0, v1, :cond_8

    .line 147
    .line 148
    if-eq p0, v0, :cond_8

    .line 149
    .line 150
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    invoke-direct {p0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    invoke-direct {p0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_5
    throw p0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch

    .line 164
    .line 165
    .line 166
    .line 167
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->z:Lr3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr3;->g1()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x1

    .line 11
    invoke-static {p0}, Lq3;->i(I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final b()Lvw3;
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [Ljava/lang/String;

    .line 3
    .line 4
    sget-object v0, Lx62;->C:Lx62;

    .line 5
    .line 6
    invoke-static {v0, p0}, Lz62;->c(Lx62;[Ljava/lang/String;)Lv62;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public final c()Lpe2;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->y:Lpe2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x5

    .line 7
    invoke-static {p0}, Lq3;->i(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
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

.method public final f(Lvq0;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lqp7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lpe2;->C:Lpe2;

    .line 6
    .line 7
    check-cast p1, Lqp7;

    .line 8
    .line 9
    sget-object v1, Lc0;->z:Lc0;

    .line 10
    .line 11
    iget-object p0, p0, Lq3;->z:Lr3;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, p0, p1, v2, v1}, Lpe2;->p(Lqp7;Lqp7;ZLgs2;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g()Lfv3;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->z:Lr3;

    .line 2
    .line 3
    invoke-static {p0}, Lts1;->e(Lvj1;)Lfv3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x4

    .line 11
    invoke-static {p0}, Lq3;->i(I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x2

    .line 7
    invoke-static {p0}, Lq3;->i(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
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

.method public final h(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->z:Lr3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr3;->f1(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/16 p0, 0x8

    .line 11
    .line 12
    invoke-static {p0}, Lq3;->i(I)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
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

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->z:Lr3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwj1;->getName()Luq4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Luq4;->w:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
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

.method public final u()Lvq0;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->z:Lr3;

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

.method public final y()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
    .line 3
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
