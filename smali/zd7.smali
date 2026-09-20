.class public abstract Lzd7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "H"

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {v1, v0}, Lk57;->q0(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lzd7;->a:Ljava/lang/String;

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
.end method

.method public static a(Ltg7;Ltp1;Ldl2;)J
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lzd7;->b(Ltg7;Ltp1;Ldl2;I)Lzg;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object p1, p0, Lzg;->a:Ldh;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldh;->d()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ll55;->f(F)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Lzg;->b()F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ll55;->f(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-long p1, p1

    .line 25
    const/16 v0, 0x20

    .line 26
    .line 27
    shl-long/2addr p1, v0

    .line 28
    int-to-long v0, p0

    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    or-long p0, p1, v0

    .line 36
    .line 37
    return-wide p0
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

.method public static final b(Ltg7;Ltp1;Ldl2;I)Lzg;
    .locals 17

    .line 1
    const/4 v0, 0x0

    .line 2
    move/from16 v3, p3

    .line 3
    .line 4
    invoke-static {v0, v3}, Lz65;->V(II)Lre3;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    new-instance v8, Lha7;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v8, v1}, Lha7;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/16 v9, 0x1e

    .line 15
    .line 16
    const-string v5, "\n"

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    invoke-static/range {v4 .. v9}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    new-instance v2, Ldh;

    .line 25
    .line 26
    sget-object v13, La42;->w:La42;

    .line 27
    .line 28
    move-object v14, v13

    .line 29
    move-object/from16 v12, p0

    .line 30
    .line 31
    move-object/from16 v16, p1

    .line 32
    .line 33
    move-object/from16 v15, p2

    .line 34
    .line 35
    move-object v10, v2

    .line 36
    invoke-direct/range {v10 .. v16}, Ldh;-><init>(Ljava/lang/String;Ltg7;Ljava/util/List;Ljava/util/List;Ldl2;Ltp1;)V

    .line 37
    .line 38
    .line 39
    const/16 v1, 0xf

    .line 40
    .line 41
    invoke-static {v0, v0, v0, v0, v1}, Lm31;->b(IIIII)J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    new-instance v1, Lzg;

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    invoke-direct/range {v1 .. v6}, Lzg;-><init>(Ldh;IIJ)V

    .line 49
    .line 50
    .line 51
    return-object v1
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
