.class public abstract Lyf7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lyy0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpp5;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpp5;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lyy0;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lyy0;-><init>(Lsr2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lyf7;->a:Lyy0;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Ltg7;Lgs2;Lyt2;I)V
    .locals 3

    .line 1
    const v0, 0xe9e0ce

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
    and-int/lit8 v1, p3, 0x30

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v1, 0x10

    .line 31
    .line 32
    :goto_1
    or-int/2addr v0, v1

    .line 33
    :cond_2
    and-int/lit8 v1, v0, 0x13

    .line 34
    .line 35
    const/16 v2, 0x12

    .line 36
    .line 37
    if-eq v1, v2, :cond_3

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    const/4 v1, 0x0

    .line 42
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {p2, v2, v1}, Lyt2;->V(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    sget-object v1, Lyf7;->a:Lyy0;

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ltg7;

    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ltg7;->d(Ltg7;)Ltg7;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    and-int/lit8 v0, v0, 0x70

    .line 67
    .line 68
    const/16 v2, 0x8

    .line 69
    .line 70
    or-int/2addr v0, v2

    .line 71
    invoke-static {v1, p1, p2, v0}, Lt49;->c(Lju5;Lgs2;Lyt2;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 76
    .line 77
    .line 78
    :goto_3
    invoke-virtual {p2}, Lyt2;->v()Lyx5;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-eqz p2, :cond_5

    .line 83
    .line 84
    new-instance v0, Ldj7;

    .line 85
    .line 86
    const/16 v1, 0x15

    .line 87
    .line 88
    invoke-direct {v0, p0, p1, p3, v1}, Ldj7;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p2, Lyx5;->d:Lgs2;

    .line 92
    .line 93
    :cond_5
    return-void
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

.method public static final b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V
    .locals 36

    move-object/from16 v0, p19

    move/from16 v1, p20

    move/from16 v2, p21

    move/from16 v3, p22

    const v4, 0x6bda414b

    .line 1
    invoke-virtual {v0, v4}, Lyt2;->g0(I)Lyt2;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v1, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v0, v11}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v7, v7, 0x180

    move-wide/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v1, 0x180

    move-wide/from16 v5, p2

    if-nez v15, :cond_7

    invoke-virtual {v0, v5, v6}, Lyt2;->f(J)Z

    move-result v17

    if-eqz v17, :cond_6

    const/16 v17, 0x100

    goto :goto_4

    :cond_6
    const/16 v17, 0x80

    :goto_4
    or-int v7, v7, v17

    :cond_7
    :goto_5
    or-int/lit16 v9, v7, 0xc00

    and-int/lit8 v18, v3, 0x10

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-eqz v18, :cond_8

    or-int/lit16 v9, v7, 0x6c00

    move-wide/from16 v10, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v7, v1, 0x6000

    move-wide/from16 v10, p4

    if-nez v7, :cond_a

    invoke-virtual {v0, v10, v11}, Lyt2;->f(J)Z

    move-result v21

    if-eqz v21, :cond_9

    move/from16 v21, v20

    goto :goto_6

    :cond_9
    move/from16 v21, v19

    :goto_6
    or-int v9, v9, v21

    :cond_a
    :goto_7
    const/high16 v21, 0x30000

    or-int v22, v9, v21

    and-int/lit8 v23, v3, 0x40

    const/high16 v24, 0x1b0000

    if-eqz v23, :cond_c

    or-int v22, v9, v24

    :cond_b
    move-object/from16 v9, p6

    goto :goto_9

    :cond_c
    const/high16 v9, 0x180000

    and-int/2addr v9, v1

    if-nez v9, :cond_b

    move-object/from16 v9, p6

    invoke-virtual {v0, v9}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_d

    const/high16 v25, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v25, 0x80000

    :goto_8
    or-int v22, v22, v25

    :goto_9
    and-int/lit16 v7, v3, 0x80

    const/high16 v26, 0x400000

    const/high16 v27, 0x800000

    const/high16 v28, 0xc00000

    if-eqz v7, :cond_e

    or-int v22, v22, v28

    move-object/from16 v13, p7

    goto :goto_b

    :cond_e
    and-int v29, v1, v28

    move-object/from16 v13, p7

    if-nez v29, :cond_10

    invoke-virtual {v0, v13}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_f

    move/from16 v30, v27

    goto :goto_a

    :cond_f
    move/from16 v30, v26

    :goto_a
    or-int v22, v22, v30

    :cond_10
    :goto_b
    and-int/lit16 v14, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v14, :cond_11

    or-int v22, v22, v31

    move-wide/from16 v4, p8

    goto :goto_d

    :cond_11
    and-int v31, v1, v31

    move-wide/from16 v4, p8

    if-nez v31, :cond_13

    invoke-virtual {v0, v4, v5}, Lyt2;->f(J)Z

    move-result v6

    if-eqz v6, :cond_12

    const/high16 v6, 0x4000000

    goto :goto_c

    :cond_12
    const/high16 v6, 0x2000000

    :goto_c
    or-int v22, v22, v6

    :cond_13
    :goto_d
    and-int/lit16 v6, v3, 0x200

    const/high16 v31, 0x30000000

    if-eqz v6, :cond_14

    or-int v22, v22, v31

    move-object/from16 v15, p10

    goto :goto_f

    :cond_14
    and-int v31, v1, v31

    move-object/from16 v15, p10

    if-nez v31, :cond_16

    invoke-virtual {v0, v15}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_15

    const/high16 v32, 0x20000000

    goto :goto_e

    :cond_15
    const/high16 v32, 0x10000000

    :goto_e
    or-int v22, v22, v32

    :cond_16
    :goto_f
    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_17

    or-int/lit8 v16, v2, 0x6

    move/from16 v32, v1

    move-object/from16 v1, p11

    goto :goto_11

    :cond_17
    move/from16 v32, v1

    move-object/from16 v1, p11

    invoke-virtual {v0, v1}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_18

    const/16 v31, 0x4

    goto :goto_10

    :cond_18
    const/16 v31, 0x2

    :goto_10
    or-int v16, v2, v31

    :goto_11
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_1a

    or-int/lit8 v16, v16, 0x30

    move-wide/from16 v4, p12

    :cond_19
    :goto_12
    move/from16 v17, v1

    move/from16 v1, v16

    goto :goto_14

    :cond_1a
    and-int/lit8 v31, v2, 0x30

    move-wide/from16 v4, p12

    if-nez v31, :cond_19

    invoke-virtual {v0, v4, v5}, Lyt2;->f(J)Z

    move-result v31

    if-eqz v31, :cond_1b

    const/16 v25, 0x20

    goto :goto_13

    :cond_1b
    const/16 v25, 0x10

    :goto_13
    or-int v16, v16, v25

    goto :goto_12

    :goto_14
    and-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_1d

    or-int/lit16 v1, v1, 0x180

    :cond_1c
    move/from16 v5, p14

    goto :goto_16

    :cond_1d
    and-int/lit16 v5, v2, 0x180

    if-nez v5, :cond_1c

    move/from16 v5, p14

    invoke-virtual {v0, v5}, Lyt2;->e(I)Z

    move-result v16

    if-eqz v16, :cond_1e

    const/16 v29, 0x100

    goto :goto_15

    :cond_1e
    const/16 v29, 0x80

    :goto_15
    or-int v1, v1, v29

    :goto_16
    move/from16 v16, v4

    or-int/lit16 v4, v1, 0xc00

    move/from16 v25, v4

    and-int/lit16 v4, v3, 0x4000

    if-eqz v4, :cond_20

    or-int/lit16 v1, v1, 0x6c00

    move/from16 v25, v1

    :cond_1f
    move/from16 v1, p16

    goto :goto_17

    :cond_20
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_1f

    move/from16 v1, p16

    invoke-virtual {v0, v1}, Lyt2;->e(I)Z

    move-result v29

    if-eqz v29, :cond_21

    move/from16 v19, v20

    :cond_21
    or-int v19, v25, v19

    move/from16 v25, v19

    :goto_17
    or-int v19, v25, v24

    and-int v20, v2, v28

    const/high16 v24, 0x20000

    if-nez v20, :cond_23

    and-int v20, v3, v24

    move-object/from16 v1, p18

    if-nez v20, :cond_22

    invoke-virtual {v0, v1}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_22

    move/from16 v26, v27

    :cond_22
    or-int v19, v19, v26

    goto :goto_18

    :cond_23
    move-object/from16 v1, p18

    :goto_18
    const v20, 0x12492493

    and-int v1, v22, v20

    const v2, 0x12492492

    const/4 v3, 0x0

    const/16 v20, 0x1

    if-ne v1, v2, :cond_25

    const v1, 0x492493

    and-int v1, v19, v1

    const v2, 0x492492

    if-eq v1, v2, :cond_24

    goto :goto_19

    :cond_24
    move v1, v3

    goto :goto_1a

    :cond_25
    :goto_19
    move/from16 v1, v20

    :goto_1a
    and-int/lit8 v2, v22, 0x1

    invoke-virtual {v0, v2, v1}, Lyt2;->V(IZ)Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-virtual {v0}, Lyt2;->a0()V

    and-int/lit8 v1, p20, 0x1

    const v2, -0x1c00001

    if-eqz v1, :cond_28

    invoke-virtual {v0}, Lyt2;->C()Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_1b

    .line 2
    :cond_26
    invoke-virtual {v0}, Lyt2;->Y()V

    and-int v1, p22, v24

    if-eqz v1, :cond_27

    and-int v19, v19, v2

    :cond_27
    move-object/from16 v1, p1

    move-wide/from16 v25, p2

    move-wide/from16 v29, p8

    move-object/from16 v8, p11

    move-wide/from16 v6, p12

    move/from16 v20, p15

    move/from16 v4, p16

    move/from16 v2, p17

    move-object/from16 v12, p18

    goto :goto_23

    :cond_28
    :goto_1b
    if-eqz v8, :cond_29

    .line 3
    sget-object v1, Ljl4;->w:Ljl4;

    goto :goto_1c

    :cond_29
    move-object/from16 v1, p1

    :goto_1c
    if-eqz v12, :cond_2a

    .line 4
    sget-wide v25, Ljt0;->g:J

    goto :goto_1d

    :cond_2a
    move-wide/from16 v25, p2

    :goto_1d
    if-eqz v18, :cond_2b

    .line 5
    sget-wide v10, Lwg7;->c:J

    :cond_2b
    const/4 v8, 0x0

    if-eqz v23, :cond_2c

    move-object v9, v8

    :cond_2c
    if-eqz v7, :cond_2d

    move-object v13, v8

    :cond_2d
    if-eqz v14, :cond_2e

    .line 6
    sget-wide v29, Lwg7;->c:J

    goto :goto_1e

    :cond_2e
    move-wide/from16 v29, p8

    :goto_1e
    if-eqz v6, :cond_2f

    move-object v15, v8

    :cond_2f
    if-eqz v32, :cond_30

    goto :goto_1f

    :cond_30
    move-object/from16 v8, p11

    :goto_1f
    if-eqz v17, :cond_31

    .line 7
    sget-wide v6, Lwg7;->c:J

    goto :goto_20

    :cond_31
    move-wide/from16 v6, p12

    :goto_20
    if-eqz v16, :cond_32

    move/from16 v5, v20

    :cond_32
    if-eqz v4, :cond_33

    const v4, 0x7fffffff

    goto :goto_21

    :cond_33
    move/from16 v4, p16

    :goto_21
    and-int v12, p22, v24

    if-eqz v12, :cond_34

    .line 8
    sget-object v12, Lyf7;->a:Lyy0;

    .line 9
    invoke-virtual {v0, v12}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ltg7;

    and-int v19, v19, v2

    :goto_22
    move/from16 v2, v20

    goto :goto_23

    :cond_34
    move-object/from16 v12, p18

    goto :goto_22

    .line 10
    :goto_23
    invoke-virtual {v0}, Lyt2;->s()V

    const v14, -0x21b088d2

    .line 11
    invoke-virtual {v0, v14}, Lyt2;->e0(I)V

    const-wide/16 v16, 0x10

    cmp-long v14, v25, v16

    if-eqz v14, :cond_35

    move-object/from16 p15, v1

    move/from16 p16, v2

    move-wide/from16 v23, v25

    goto :goto_25

    :cond_35
    const v14, -0x21b085cd

    invoke-virtual {v0, v14}, Lyt2;->e0(I)V

    invoke-virtual {v12}, Ltg7;->b()J

    move-result-wide v23

    cmp-long v14, v23, v16

    if-eqz v14, :cond_36

    move-object/from16 p15, v1

    move/from16 p16, v2

    goto :goto_24

    .line 12
    :cond_36
    sget-object v14, Lj41;->a:Lyy0;

    .line 13
    invoke-virtual {v0, v14}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    move-result-object v14

    .line 14
    check-cast v14, Ljt0;

    move-object/from16 p15, v1

    move/from16 p16, v2

    .line 15
    iget-wide v1, v14, Ljt0;->a:J

    move-wide/from16 v23, v1

    .line 16
    :goto_24
    invoke-virtual {v0, v3}, Lyt2;->r(Z)V

    :goto_25
    invoke-virtual {v0, v3}, Lyt2;->r(Z)V

    if-eqz v8, :cond_37

    .line 17
    iget v3, v8, Lhc7;->a:I

    :cond_37
    const v1, 0xfd6f50

    move/from16 p14, v1

    move/from16 p11, v3

    move-wide/from16 p12, v6

    move-object/from16 p6, v9

    move-wide/from16 p4, v10

    move-object/from16 p1, v12

    move-object/from16 p7, v13

    move-object/from16 p10, v15

    move-wide/from16 p2, v23

    move-wide/from16 p8, v29

    .line 18
    invoke-static/range {p1 .. p14}, Ltg7;->e(Ltg7;JJLam2;Lea7;JLrd7;IJI)Ltg7;

    move-result-object v1

    and-int/lit8 v2, v22, 0x7e

    or-int/lit16 v2, v2, 0xc00

    shl-int/lit8 v3, v19, 0x6

    const v14, 0xe000

    and-int/2addr v14, v3

    or-int/2addr v2, v14

    or-int v2, v2, v21

    const/high16 v14, 0x380000

    and-int/2addr v3, v14

    or-int/2addr v2, v3

    or-int v2, v2, v28

    shl-int/lit8 v3, v22, 0x12

    const/high16 v14, 0x70000000

    and-int/2addr v3, v14

    or-int/2addr v2, v3

    const/16 v3, 0x100

    move-object/from16 p1, p0

    move-object/from16 p2, p15

    move/from16 p7, p16

    move-object/from16 p8, v0

    move-object/from16 p3, v1

    move/from16 p9, v2

    move/from16 p10, v3

    move/from16 p6, v4

    move/from16 p4, v5

    move/from16 p5, v20

    .line 19
    invoke-static/range {p1 .. p10}, Lt49;->b(Ljava/lang/String;Lml4;Ltg7;IZIILyt2;II)V

    move-object/from16 v1, p2

    move/from16 v0, p7

    move/from16 v18, v0

    move-object v2, v1

    move/from16 v17, v4

    move-object/from16 v19, v12

    move/from16 v16, v20

    move-wide/from16 v3, v25

    move-object v12, v8

    move-object v8, v13

    move-wide v13, v6

    move-object v7, v9

    move-object/from16 v35, v15

    move v15, v5

    move-wide v5, v10

    move-object/from16 v11, v35

    move-wide/from16 v9, v29

    goto :goto_26

    .line 20
    :cond_38
    invoke-virtual/range {p19 .. p19}, Lyt2;->Y()V

    move-object v2, v15

    move v15, v5

    move-wide v5, v10

    move-object v11, v2

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v12, p11

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object v7, v9

    move-object v8, v13

    move-wide/from16 v9, p8

    move-wide/from16 v13, p12

    .line 21
    :goto_26
    invoke-virtual/range {p19 .. p19}, Lyt2;->v()Lyx5;

    move-result-object v0

    if-eqz v0, :cond_39

    move-object v1, v0

    new-instance v0, Lxf7;

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    move-object/from16 v34, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v22}, Lxf7;-><init>(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;III)V

    move-object/from16 v1, v34

    .line 22
    iput-object v0, v1, Lyx5;->d:Lgs2;

    :cond_39
    return-void
.end method

.method public static final c(Lvl;Lml4;JJJJIZIILjava/util/Map;Lvr2;Ltg7;Lyt2;III)V
    .locals 49

    move-object/from16 v1, p0

    move-object/from16 v0, p17

    move/from16 v2, p18

    move/from16 v3, p20

    const v4, 0x116b5779

    .line 1
    invoke-virtual {v0, v4}, Lyt2;->g0(I)Lyt2;

    invoke-virtual {v0, v1}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_1

    or-int/lit8 v4, v4, 0x30

    move-object/from16 v9, p1

    goto :goto_2

    :cond_1
    move-object/from16 v9, p1

    invoke-virtual {v0, v9}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_1

    :cond_2
    const/16 v10, 0x10

    :goto_1
    or-int/2addr v4, v10

    :goto_2
    and-int/lit8 v10, v3, 0x4

    if-eqz v10, :cond_3

    or-int/lit16 v4, v4, 0x180

    move-wide/from16 v11, p2

    goto :goto_4

    :cond_3
    move-wide/from16 v11, p2

    invoke-virtual {v0, v11, v12}, Lyt2;->f(J)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_3

    :cond_4
    const/16 v13, 0x80

    :goto_3
    or-int/2addr v4, v13

    :goto_4
    or-int/lit16 v13, v4, 0xc00

    and-int/lit8 v14, v3, 0x10

    if-eqz v14, :cond_5

    or-int/lit16 v13, v4, 0x6c00

    move-wide/from16 v7, p4

    goto :goto_6

    :cond_5
    and-int/lit16 v4, v2, 0x6000

    move-wide/from16 v7, p4

    if-nez v4, :cond_7

    invoke-virtual {v0, v7, v8}, Lyt2;->f(J)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x4000

    goto :goto_5

    :cond_6
    const/16 v16, 0x2000

    :goto_5
    or-int v13, v13, v16

    :cond_7
    :goto_6
    const/high16 v16, 0x36db0000

    or-int v13, v13, v16

    or-int/lit8 v16, p19, 0x6

    and-int/lit16 v4, v3, 0x800

    if-eqz v4, :cond_8

    const/16 v16, 0x36

    move/from16 v19, v6

    move-wide/from16 v5, p8

    goto :goto_8

    :cond_8
    and-int/lit8 v18, p19, 0x30

    move/from16 v19, v6

    move-wide/from16 v5, p8

    if-nez v18, :cond_a

    invoke-virtual {v0, v5, v6}, Lyt2;->f(J)Z

    move-result v20

    if-eqz v20, :cond_9

    const/16 v15, 0x20

    goto :goto_7

    :cond_9
    const/16 v15, 0x10

    :goto_7
    or-int v16, v16, v15

    :cond_a
    :goto_8
    const v15, 0xdb6d80

    or-int v15, v16, v15

    const/high16 v16, 0x40000

    and-int v17, v3, v16

    move-object/from16 v2, p16

    if-nez v17, :cond_b

    invoke-virtual {v0, v2}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    const/high16 v17, 0x4000000

    goto :goto_9

    :cond_b
    const/high16 v17, 0x2000000

    :goto_9
    or-int v15, v15, v17

    const v17, 0x12492493

    and-int v2, v13, v17

    const v3, 0x12492492

    move/from16 v17, v4

    const/16 v20, 0x1

    if-ne v2, v3, :cond_d

    const v2, 0x2492493

    and-int/2addr v2, v15

    const v3, 0x2492492

    if-eq v2, v3, :cond_c

    goto :goto_a

    :cond_c
    const/4 v2, 0x0

    goto :goto_b

    :cond_d
    :goto_a
    move/from16 v2, v20

    :goto_b
    and-int/lit8 v3, v13, 0x1

    invoke-virtual {v0, v3, v2}, Lyt2;->V(IZ)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-virtual {v0}, Lyt2;->a0()V

    and-int/lit8 v2, p18, 0x1

    sget-object v3, Lay0;->a:Ld63;

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Lyt2;->C()Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_c

    .line 2
    :cond_e
    invoke-virtual {v0}, Lyt2;->Y()V

    move/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move/from16 v17, p13

    move-object/from16 v19, p14

    move-object/from16 v21, p15

    move-object/from16 v22, p16

    move-object v2, v9

    move-wide/from16 v9, p6

    goto :goto_f

    :cond_f
    :goto_c
    if-eqz v19, :cond_10

    .line 3
    sget-object v2, Ljl4;->w:Ljl4;

    goto :goto_d

    :cond_10
    move-object v2, v9

    :goto_d
    if-eqz v10, :cond_11

    .line 4
    sget-wide v9, Ljt0;->g:J

    move-wide v11, v9

    :cond_11
    if-eqz v14, :cond_12

    .line 5
    sget-wide v7, Lwg7;->c:J

    .line 6
    :cond_12
    sget-wide v9, Lwg7;->c:J

    if-eqz v17, :cond_13

    move-wide v5, v9

    .line 7
    :cond_13
    invoke-virtual {v0}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v3, :cond_14

    .line 8
    new-instance v14, Lha7;

    const/16 v15, 0xb

    invoke-direct {v14, v15}, Lha7;-><init>(I)V

    .line 9
    invoke-virtual {v0, v14}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 10
    :cond_14
    check-cast v14, Lvr2;

    and-int v15, p20, v16

    const v16, 0x7fffffff

    sget-object v17, Lb42;->w:Lb42;

    if-eqz v15, :cond_15

    .line 11
    sget-object v15, Lyf7;->a:Lyy0;

    .line 12
    invoke-virtual {v0, v15}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ltg7;

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    :goto_e
    move-object/from16 v19, v17

    move/from16 v14, v20

    move v15, v14

    move/from16 v17, v15

    goto :goto_f

    :cond_15
    move-object/from16 v22, p16

    move-object/from16 v21, v14

    goto :goto_e

    .line 13
    :goto_f
    invoke-virtual {v0}, Lyt2;->s()V

    const v4, 0x63f3c1dc

    .line 14
    invoke-virtual {v0, v4}, Lyt2;->e0(I)V

    const-wide/16 v24, 0x10

    cmp-long v4, v11, v24

    if-eqz v4, :cond_16

    move-wide/from16 p12, v5

    move-wide/from16 v26, v11

    const/4 v4, 0x0

    goto :goto_12

    :cond_16
    const v4, 0x63f3c4e1

    invoke-virtual {v0, v4}, Lyt2;->e0(I)V

    invoke-virtual/range {v22 .. v22}, Ltg7;->b()J

    move-result-wide v26

    cmp-long v4, v26, v24

    if-eqz v4, :cond_17

    move-wide/from16 p12, v5

    :goto_10
    const/4 v4, 0x0

    goto :goto_11

    .line 15
    :cond_17
    sget-object v4, Lj41;->a:Lyy0;

    .line 16
    invoke-virtual {v0, v4}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    move-result-object v4

    .line 17
    check-cast v4, Ljt0;

    move-wide/from16 p12, v5

    .line 18
    iget-wide v4, v4, Ljt0;->a:J

    move-wide/from16 v26, v4

    goto :goto_10

    .line 19
    :goto_11
    invoke-virtual {v0, v4}, Lyt2;->r(Z)V

    :goto_12
    invoke-virtual {v0, v4}, Lyt2;->r(Z)V

    .line 20
    sget-object v5, Lch4;->b:Lt37;

    .line 21
    invoke-virtual {v0, v5}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzg4;

    .line 22
    iget-object v5, v5, Lzg4;->a:Lqt0;

    .line 23
    iget-wide v5, v5, Lqt0;->a:J

    .line 24
    invoke-virtual {v0, v5, v6}, Lyt2;->f(J)Z

    move-result v23

    .line 25
    invoke-virtual {v0}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v4

    if-nez v23, :cond_18

    if-ne v4, v3, :cond_19

    .line 26
    :cond_18
    new-instance v4, Lgg7;

    .line 27
    new-instance v28, Lyy6;

    const/16 v46, 0x0

    const v47, 0xeffe

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const-wide/16 v43, 0x0

    sget-object v45, Lrd7;->c:Lrd7;

    move-wide/from16 v29, v5

    invoke-direct/range {v28 .. v47}, Lyy6;-><init>(JJLam2;Lyl2;Lzl2;Lea7;Ljava/lang/String;JLh60;Llf7;Lya4;JLrd7;Llq6;I)V

    move-object/from16 v5, v28

    const/4 v6, 0x0

    .line 28
    invoke-direct {v4, v5, v6, v6, v6}, Lgg7;-><init>(Lyy6;Lyy6;Lyy6;Lyy6;)V

    .line 29
    invoke-virtual {v0, v4}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 30
    :cond_19
    check-cast v4, Lgg7;

    and-int/lit8 v5, v13, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_1a

    goto :goto_13

    :cond_1a
    const/16 v20, 0x0

    .line 31
    :goto_13
    invoke-virtual {v0, v4}, Lyt2;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int v5, v20, v5

    .line 32
    invoke-virtual {v0}, Lyt2;->Q()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1b

    if-ne v6, v3, :cond_1c

    .line 33
    :cond_1b
    new-instance v3, Lay5;

    const/16 v5, 0x18

    invoke-direct {v3, v5, v4}, Lay5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lvl;->b(Lvr2;)Lvl;

    move-result-object v6

    .line 34
    invoke-virtual {v0, v6}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 35
    :cond_1c
    check-cast v6, Lvl;

    const v3, 0xfd6f50

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x0

    move/from16 p14, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-wide/from16 p4, v7

    move-wide/from16 p8, v9

    move-object/from16 p10, v18

    move-object/from16 p1, v22

    move-wide/from16 p2, v26

    const/16 p11, 0x0

    .line 36
    invoke-static/range {p1 .. p14}, Ltg7;->e(Ltg7;JJLam2;Lea7;JLrd7;IJI)Ltg7;

    move-result-object v3

    move-object/from16 v4, p1

    move-wide/from16 v22, p12

    and-int/lit8 v5, v13, 0x70

    const v13, 0x6db6c00

    or-int/2addr v5, v13

    const/4 v13, 0x6

    move-object/from16 p10, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move/from16 p11, v5

    move-object/from16 p1, v6

    move/from16 p12, v13

    move/from16 p5, v14

    move/from16 p6, v15

    move/from16 p7, v16

    move/from16 p8, v17

    move-object/from16 p9, v19

    move-object/from16 p4, v21

    .line 37
    invoke-static/range {p1 .. p12}, Lt49;->a(Lvl;Lml4;Ltg7;Lvr2;IZIILjava/util/Map;Lyt2;II)V

    move-object/from16 v14, p4

    move/from16 v20, p5

    move/from16 v0, p6

    move/from16 v3, p8

    move-object/from16 v17, p9

    move-wide v5, v7

    move-wide v7, v9

    move/from16 v13, v16

    move-object/from16 v15, v17

    move-wide/from16 v9, v22

    move-object/from16 v17, v4

    move-object/from16 v16, v14

    move v14, v3

    move-wide v3, v11

    move/from16 v11, v20

    move v12, v0

    goto :goto_14

    .line 38
    :cond_1d
    invoke-virtual/range {p17 .. p17}, Lyt2;->Y()V

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object v2, v9

    move-wide v3, v11

    move/from16 v11, p10

    move/from16 v12, p11

    move-wide v9, v5

    move-wide v5, v7

    move-wide/from16 v7, p6

    .line 39
    :goto_14
    invoke-virtual/range {p17 .. p17}, Lyt2;->v()Lyx5;

    move-result-object v0

    if-eqz v0, :cond_1e

    move-object/from16 v18, v0

    new-instance v0, Lwf7;

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v48, v18

    move/from16 v18, p18

    invoke-direct/range {v0 .. v20}, Lwf7;-><init>(Lvl;Lml4;JJJJIZIILjava/util/Map;Lvr2;Ltg7;III)V

    move-object v1, v0

    move-object/from16 v0, v48

    .line 40
    iput-object v1, v0, Lyx5;->d:Lgs2;

    :cond_1e
    return-void
.end method
