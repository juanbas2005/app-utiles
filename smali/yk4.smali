.class public final Lyk4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static h:Lyk4;


# instance fields
.field public final a:Ley3;

.field public final b:Ltg7;

.field public final c:Lwp1;

.field public final d:Ldl2;

.field public final e:Ltg7;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Ley3;Ltg7;Lwp1;Ldl2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyk4;->a:Ley3;

    .line 5
    .line 6
    iput-object p2, p0, Lyk4;->b:Ltg7;

    .line 7
    .line 8
    iput-object p3, p0, Lyk4;->c:Lwp1;

    .line 9
    .line 10
    iput-object p4, p0, Lyk4;->d:Ldl2;

    .line 11
    .line 12
    invoke-static {p2, p1}, Laa5;->k(Ltg7;Ley3;)Ltg7;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lyk4;->e:Ltg7;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, Lyk4;->f:F

    .line 21
    .line 22
    iput p1, p0, Lyk4;->g:F

    .line 23
    .line 24
    return-void
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
.method public final a(JI)J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget v2, v0, Lyk4;->g:F

    .line 6
    .line 7
    iget v3, v0, Lyk4;->f:F

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :cond_0
    sget-object v10, Lzk4;->a:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v7, Ldh;

    .line 26
    .line 27
    iget-object v11, v0, Lyk4;->e:Ltg7;

    .line 28
    .line 29
    sget-object v12, La42;->w:La42;

    .line 30
    .line 31
    iget-object v14, v0, Lyk4;->d:Ldl2;

    .line 32
    .line 33
    iget-object v15, v0, Lyk4;->c:Lwp1;

    .line 34
    .line 35
    move-object v13, v12

    .line 36
    move-object v9, v7

    .line 37
    invoke-direct/range {v9 .. v15}, Ldh;-><init>(Ljava/lang/String;Ltg7;Ljava/util/List;Ljava/util/List;Ldl2;Ltp1;)V

    .line 38
    .line 39
    .line 40
    const/16 v2, 0xf

    .line 41
    .line 42
    invoke-static {v5, v5, v5, v5, v2}, Lm31;->b(IIIII)J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    new-instance v6, Lzg;

    .line 47
    .line 48
    move v9, v8

    .line 49
    invoke-direct/range {v6 .. v11}, Lzg;-><init>(Ldh;IIJ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Lzg;->b()F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    sget-object v13, Lzk4;->b:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v7, Ldh;

    .line 59
    .line 60
    iget-object v14, v0, Lyk4;->e:Ltg7;

    .line 61
    .line 62
    iget-object v4, v0, Lyk4;->d:Ldl2;

    .line 63
    .line 64
    move-object/from16 v16, v12

    .line 65
    .line 66
    move-object/from16 v17, v4

    .line 67
    .line 68
    move-object/from16 v18, v15

    .line 69
    .line 70
    move-object v15, v12

    .line 71
    move-object v12, v7

    .line 72
    invoke-direct/range {v12 .. v18}, Ldh;-><init>(Ljava/lang/String;Ltg7;Ljava/util/List;Ljava/util/List;Ldl2;Ltp1;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v5, v5, v5, v5, v2}, Lm31;->b(IIIII)J

    .line 76
    .line 77
    .line 78
    move-result-wide v10

    .line 79
    new-instance v6, Lzg;

    .line 80
    .line 81
    const/4 v8, 0x2

    .line 82
    invoke-direct/range {v6 .. v11}, Lzg;-><init>(Ldh;IIJ)V

    .line 83
    .line 84
    .line 85
    move v8, v9

    .line 86
    invoke-virtual {v6}, Lzg;->b()F

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    sub-float/2addr v2, v3

    .line 91
    iput v3, v0, Lyk4;->g:F

    .line 92
    .line 93
    iput v2, v0, Lyk4;->f:F

    .line 94
    .line 95
    move/from16 v19, v3

    .line 96
    .line 97
    move v3, v2

    .line 98
    move/from16 v2, v19

    .line 99
    .line 100
    :cond_1
    if-eq v1, v8, :cond_3

    .line 101
    .line 102
    add-int/lit8 v0, v1, -0x1

    .line 103
    .line 104
    int-to-float v0, v0

    .line 105
    mul-float/2addr v3, v0

    .line 106
    add-float/2addr v3, v2

    .line 107
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-gez v0, :cond_2

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    move v5, v0

    .line 115
    :goto_0
    invoke-static/range {p1 .. p2}, Lk31;->g(J)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-le v5, v0, :cond_4

    .line 120
    .line 121
    move v5, v0

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-static/range {p1 .. p2}, Lk31;->i(J)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    :cond_4
    :goto_1
    invoke-static/range {p1 .. p2}, Lk31;->g(J)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-static/range {p1 .. p2}, Lk31;->j(J)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static/range {p1 .. p2}, Lk31;->h(J)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-static {v1, v2, v5, v0}, Lm31;->a(IIII)J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    return-wide v0
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
