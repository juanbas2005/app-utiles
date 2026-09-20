.class public final Lg12;
.super Lxr7;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final j:[I

.field public static final k:[I

.field public static final l:[[I


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lg12;->j:[I

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    new-array v1, v1, [I

    .line 12
    .line 13
    fill-array-data v1, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v1, Lg12;->k:[I

    .line 17
    .line 18
    new-array v1, v0, [I

    .line 19
    .line 20
    fill-array-data v1, :array_2

    .line 21
    .line 22
    .line 23
    new-array v0, v0, [I

    .line 24
    .line 25
    fill-array-data v0, :array_3

    .line 26
    .line 27
    .line 28
    filled-new-array {v1, v0}, [[I

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lg12;->l:[[I

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 4
        0x0
        0xb
        0xd
        0xe
        0x13
        0x19
        0x1c
        0x15
        0x16
        0x1a
    .end array-data

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
    :array_1
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data

    .line 60
    .line 61
    .line 62
    .line 63
    :array_2
    .array-data 4
        0x38
        0x34
        0x32
        0x31
        0x2c
        0x26
        0x23
        0x2a
        0x29
        0x25
    .end array-data

    :array_3
    .array-data 4
        0x7
        0xb
        0xd
        0xe
        0x13
        0x19
        0x1c
        0x15
        0x16
        0x1a
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lxr7;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x4

    .line 10
    new-array p1, p1, [I

    .line 11
    .line 12
    iput-object p1, p0, Lg12;->i:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Lxr7;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lg12;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, v0}, Lg12;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lg12;->i:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    invoke-direct {p0}, Lxr7;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x4

    .line 31
    new-array p1, p1, [I

    .line 32
    .line 33
    iput-object p1, p0, Lg12;->i:Ljava/lang/Object;

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-direct {p0}, Lxr7;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x4

    .line 40
    new-array p1, p1, [I

    .line 41
    .line 42
    iput-object p1, p0, Lg12;->i:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static o(Ln66;)Ln66;
    .locals 5

    .line 1
    iget-object v0, p0, Ln66;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/16 v2, 0x30

    .line 9
    .line 10
    if-ne v1, v2, :cond_1

    .line 11
    .line 12
    new-instance v1, Ln66;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, Ln66;->c:[Lr66;

    .line 20
    .line 21
    sget-object v3, Ld50;->K:Ld50;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v1, v0, v4, v2, v3}, Ln66;-><init>(Ljava/lang/String;[B[Lr66;Ld50;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Ln66;->e:Ljava/util/Map;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ln66;->a(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object v1

    .line 35
    :cond_1
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0
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


# virtual methods
.method public a(Lqc3;Ljava/util/Map;)Ln66;
    .locals 1

    .line 1
    iget v0, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lm55;->a(Lqc3;Ljava/util/Map;)Ln66;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lg12;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lg12;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lm55;->a(Lqc3;Ljava/util/Map;)Ln66;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lg12;->o(Ln66;)Ln66;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
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
.end method

.method public b(ILi90;Ljava/util/Map;)Ln66;
    .locals 1

    .line 1
    iget v0, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lxr7;->b(ILi90;Ljava/util/Map;)Ln66;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lg12;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lg12;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Lxr7;->b(ILi90;Ljava/util/Map;)Ln66;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lg12;->o(Ln66;)Ln66;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
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

.method public g(Ljava/lang/String;)Z
    .locals 10

    .line 1
    iget v0, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lxr7;->g(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 v0, 0x6

    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x7

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {p1, v1, v2, v0, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 v4, 0xc

    .line 23
    .line 24
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x5

    .line 35
    aget-char v5, v0, v4

    .line 36
    .line 37
    const-string v6, "00000"

    .line 38
    .line 39
    const-string v7, "0000"

    .line 40
    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x3

    .line 43
    packed-switch v5, :pswitch_data_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, v3, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    const/4 v4, 0x4

    .line 57
    invoke-virtual {v1, v0, v3, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    aget-char v0, v0, v4

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_2
    invoke-virtual {v1, v0, v3, v9}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v0, v9, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_3
    invoke-virtual {v1, v0, v3, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0, v8, v9}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    const/16 v3, 0x8

    .line 96
    .line 97
    if-lt v0, v3, :cond_0

    .line 98
    .line 99
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-super {p0, p1}, Lxr7;->g(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    return p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method public i(Li90;I)[I
    .locals 2

    .line 1
    iget v0, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lxr7;->i(Li90;I)[I

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const/4 p0, 0x6

    .line 12
    new-array p0, p0, [I

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    sget-object v1, Lg12;->k:[I

    .line 16
    .line 17
    invoke-static {p1, p2, v0, v1, p0}, Lxr7;->l(Li90;IZ[I[I)[I

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final j(Li90;[ILjava/lang/StringBuilder;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, Lg12;->h:I

    .line 10
    .line 11
    sget-object v5, Lxr7;->g:[[I

    .line 12
    .line 13
    const/4 v6, 0x6

    .line 14
    const/16 v7, 0xa

    .line 15
    .line 16
    sget-object v8, Lxr7;->e:[I

    .line 17
    .line 18
    sget-object v9, Lxr7;->f:[[I

    .line 19
    .line 20
    const/4 v10, 0x5

    .line 21
    const/4 v11, 0x3

    .line 22
    const/4 v12, 0x2

    .line 23
    const/4 v13, 0x1

    .line 24
    const/4 v14, 0x0

    .line 25
    iget-object v0, v0, Lg12;->i:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v4, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v0, Lg12;

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2, v3}, Lg12;->j(Li90;[ILjava/lang/StringBuilder;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    return v0

    .line 37
    :pswitch_0
    check-cast v0, [I

    .line 38
    .line 39
    aput v14, v0, v14

    .line 40
    .line 41
    aput v14, v0, v13

    .line 42
    .line 43
    aput v14, v0, v12

    .line 44
    .line 45
    aput v14, v0, v11

    .line 46
    .line 47
    iget v4, v1, Li90;->x:I

    .line 48
    .line 49
    aget v2, v2, v13

    .line 50
    .line 51
    move v5, v14

    .line 52
    :goto_0
    const/4 v6, 0x4

    .line 53
    if-ge v5, v6, :cond_1

    .line 54
    .line 55
    if-ge v2, v4, :cond_1

    .line 56
    .line 57
    invoke-static {v1, v0, v2, v9}, Lxr7;->h(Li90;[II[[I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-int/lit8 v6, v6, 0x30

    .line 62
    .line 63
    int-to-char v6, v6

    .line 64
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    array-length v6, v0

    .line 68
    move v7, v14

    .line 69
    :goto_1
    if-ge v7, v6, :cond_0

    .line 70
    .line 71
    aget v11, v0, v7

    .line 72
    .line 73
    add-int/2addr v2, v11

    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    new-array v5, v10, [I

    .line 81
    .line 82
    invoke-static {v1, v2, v13, v8, v5}, Lxr7;->l(Li90;IZ[I[I)[I

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    aget v2, v2, v13

    .line 87
    .line 88
    move v5, v14

    .line 89
    :goto_2
    if-ge v5, v6, :cond_3

    .line 90
    .line 91
    if-ge v2, v4, :cond_3

    .line 92
    .line 93
    invoke-static {v1, v0, v2, v9}, Lxr7;->h(Li90;[II[[I)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    add-int/lit8 v7, v7, 0x30

    .line 98
    .line 99
    int-to-char v7, v7

    .line 100
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    array-length v7, v0

    .line 104
    move v8, v14

    .line 105
    :goto_3
    if-ge v8, v7, :cond_2

    .line 106
    .line 107
    aget v10, v0, v8

    .line 108
    .line 109
    add-int/2addr v2, v10

    .line 110
    add-int/lit8 v8, v8, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    return v2

    .line 117
    :pswitch_1
    check-cast v0, [I

    .line 118
    .line 119
    aput v14, v0, v14

    .line 120
    .line 121
    aput v14, v0, v13

    .line 122
    .line 123
    aput v14, v0, v12

    .line 124
    .line 125
    aput v14, v0, v11

    .line 126
    .line 127
    iget v4, v1, Li90;->x:I

    .line 128
    .line 129
    aget v2, v2, v13

    .line 130
    .line 131
    move v8, v14

    .line 132
    move v9, v8

    .line 133
    :goto_4
    if-ge v8, v6, :cond_6

    .line 134
    .line 135
    if-ge v2, v4, :cond_6

    .line 136
    .line 137
    invoke-static {v1, v0, v2, v5}, Lxr7;->h(Li90;[II[[I)I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    rem-int/lit8 v11, v10, 0xa

    .line 142
    .line 143
    add-int/lit8 v11, v11, 0x30

    .line 144
    .line 145
    int-to-char v11, v11

    .line 146
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    array-length v11, v0

    .line 150
    move v12, v14

    .line 151
    :goto_5
    if-ge v12, v11, :cond_4

    .line 152
    .line 153
    aget v15, v0, v12

    .line 154
    .line 155
    add-int/2addr v2, v15

    .line 156
    add-int/lit8 v12, v12, 0x1

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_4
    if-lt v10, v7, :cond_5

    .line 160
    .line 161
    rsub-int/lit8 v10, v8, 0x5

    .line 162
    .line 163
    shl-int v10, v13, v10

    .line 164
    .line 165
    or-int/2addr v9, v10

    .line 166
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_6
    move v0, v14

    .line 170
    :goto_6
    if-gt v0, v13, :cond_9

    .line 171
    .line 172
    move v1, v14

    .line 173
    :goto_7
    if-ge v1, v7, :cond_8

    .line 174
    .line 175
    sget-object v4, Lg12;->l:[[I

    .line 176
    .line 177
    aget-object v4, v4, v0

    .line 178
    .line 179
    aget v4, v4, v1

    .line 180
    .line 181
    if-ne v9, v4, :cond_7

    .line 182
    .line 183
    add-int/lit8 v0, v0, 0x30

    .line 184
    .line 185
    int-to-char v0, v0

    .line 186
    invoke-virtual {v3, v14, v0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    add-int/lit8 v1, v1, 0x30

    .line 190
    .line 191
    int-to-char v0, v1

    .line 192
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    return v2

    .line 196
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_9
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 203
    .line 204
    throw v0

    .line 205
    :pswitch_2
    check-cast v0, [I

    .line 206
    .line 207
    aput v14, v0, v14

    .line 208
    .line 209
    aput v14, v0, v13

    .line 210
    .line 211
    aput v14, v0, v12

    .line 212
    .line 213
    aput v14, v0, v11

    .line 214
    .line 215
    iget v4, v1, Li90;->x:I

    .line 216
    .line 217
    aget v2, v2, v13

    .line 218
    .line 219
    move v11, v14

    .line 220
    move v12, v11

    .line 221
    :goto_8
    if-ge v11, v6, :cond_c

    .line 222
    .line 223
    if-ge v2, v4, :cond_c

    .line 224
    .line 225
    invoke-static {v1, v0, v2, v5}, Lxr7;->h(Li90;[II[[I)I

    .line 226
    .line 227
    .line 228
    move-result v15

    .line 229
    rem-int/lit8 v16, v15, 0xa

    .line 230
    .line 231
    add-int/lit8 v6, v16, 0x30

    .line 232
    .line 233
    int-to-char v6, v6

    .line 234
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    array-length v6, v0

    .line 238
    move/from16 v16, v13

    .line 239
    .line 240
    move v13, v14

    .line 241
    :goto_9
    if-ge v13, v6, :cond_a

    .line 242
    .line 243
    aget v17, v0, v13

    .line 244
    .line 245
    add-int v2, v2, v17

    .line 246
    .line 247
    add-int/lit8 v13, v13, 0x1

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_a
    if-lt v15, v7, :cond_b

    .line 251
    .line 252
    rsub-int/lit8 v6, v11, 0x5

    .line 253
    .line 254
    shl-int v6, v16, v6

    .line 255
    .line 256
    or-int/2addr v12, v6

    .line 257
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 258
    .line 259
    move/from16 v13, v16

    .line 260
    .line 261
    const/4 v6, 0x6

    .line 262
    goto :goto_8

    .line 263
    :cond_c
    move/from16 v16, v13

    .line 264
    .line 265
    move v5, v14

    .line 266
    :goto_a
    if-ge v5, v7, :cond_10

    .line 267
    .line 268
    sget-object v6, Lg12;->j:[I

    .line 269
    .line 270
    aget v6, v6, v5

    .line 271
    .line 272
    if-ne v12, v6, :cond_f

    .line 273
    .line 274
    add-int/lit8 v5, v5, 0x30

    .line 275
    .line 276
    int-to-char v5, v5

    .line 277
    invoke-virtual {v3, v14, v5}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    new-array v5, v10, [I

    .line 281
    .line 282
    move/from16 v6, v16

    .line 283
    .line 284
    invoke-static {v1, v2, v6, v8, v5}, Lxr7;->l(Li90;IZ[I[I)[I

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    aget v2, v2, v6

    .line 289
    .line 290
    move v5, v14

    .line 291
    const/4 v11, 0x6

    .line 292
    :goto_b
    if-ge v5, v11, :cond_e

    .line 293
    .line 294
    if-ge v2, v4, :cond_e

    .line 295
    .line 296
    invoke-static {v1, v0, v2, v9}, Lxr7;->h(Li90;[II[[I)I

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    add-int/lit8 v6, v6, 0x30

    .line 301
    .line 302
    int-to-char v6, v6

    .line 303
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    array-length v6, v0

    .line 307
    move v7, v14

    .line 308
    :goto_c
    if-ge v7, v6, :cond_d

    .line 309
    .line 310
    aget v8, v0, v7

    .line 311
    .line 312
    add-int/2addr v2, v8

    .line 313
    add-int/lit8 v7, v7, 0x1

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_e
    return v2

    .line 320
    :cond_f
    move/from16 v6, v16

    .line 321
    .line 322
    const/4 v11, 0x6

    .line 323
    add-int/lit8 v5, v5, 0x1

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_10
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 327
    .line 328
    throw v0

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public k(ILi90;[ILjava/util/Map;)Ln66;
    .locals 1

    .line 1
    iget v0, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lxr7;->k(ILi90;[ILjava/util/Map;)Ln66;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lg12;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lg12;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3, p4}, Lxr7;->k(ILi90;[ILjava/util/Map;)Ln66;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lg12;->o(Ln66;)Ln66;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
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

.method public final n()Ld50;
    .locals 0

    .line 1
    iget p0, p0, Lg12;->h:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld50;->K:Ld50;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object p0, Ld50;->C:Ld50;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    sget-object p0, Ld50;->L:Ld50;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    sget-object p0, Ld50;->D:Ld50;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
.end method
