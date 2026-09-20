.class public abstract Lx88;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lpa5;

.field public static final b:Lpa5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Lb98;->j:F

    .line 2
    .line 3
    sget v1, Lb98;->i:F

    .line 4
    .line 5
    new-instance v2, Lpa5;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1, v0, v1}, Lpa5;-><init>(FFFF)V

    .line 8
    .line 9
    .line 10
    sput-object v2, Lx88;->a:Lpa5;

    .line 11
    .line 12
    sget v0, Lb98;->k:F

    .line 13
    .line 14
    new-instance v1, Lpa5;

    .line 15
    .line 16
    const/high16 v2, 0x41800000    # 16.0f

    .line 17
    .line 18
    invoke-direct {v1, v2, v0, v2, v0}, Lpa5;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lx88;->b:Lpa5;

    .line 22
    .line 23
    return-void
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
.end method

.method public static a(Lyt2;)Lfw4;
    .locals 18

    .line 1
    sget-object v0, Lch4;->b:Lt37;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzg4;

    .line 10
    .line 11
    iget-object v0, v0, Lzg4;->a:Lqt0;

    .line 12
    .line 13
    iget-object v1, v0, Lqt0;->k0:Lfw4;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v2, Lfw4;

    .line 18
    .line 19
    sget-object v1, Lag8;->e:Lrt0;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lst0;->d(Lqt0;Lrt0;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    sget-object v1, Lag8;->g:Lrt0;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lst0;->d(Lqt0;Lrt0;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    sget-object v1, Lag8;->f:Lrt0;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lst0;->d(Lqt0;Lrt0;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v7

    .line 37
    sget-object v1, Lag8;->h:Lrt0;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lst0;->d(Lqt0;Lrt0;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v9

    .line 43
    sget-object v11, Lag8;->i:Lrt0;

    .line 44
    .line 45
    invoke-static {v0, v11}, Lst0;->d(Lqt0;Lrt0;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    invoke-static {v0, v1}, Lst0;->d(Lqt0;Lrt0;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v14

    .line 53
    const v1, 0x3ec28f5c    # 0.38f

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v14, v15}, Ljt0;->b(FJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v14

    .line 60
    move-object/from16 p0, v2

    .line 61
    .line 62
    move-wide/from16 v16, v3

    .line 63
    .line 64
    invoke-static {v0, v11}, Lst0;->d(Lqt0;Lrt0;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    invoke-static {v1, v2, v3}, Ljt0;->b(FJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    move-wide v11, v12

    .line 73
    move-wide v13, v14

    .line 74
    move-wide/from16 v3, v16

    .line 75
    .line 76
    move-wide v15, v1

    .line 77
    move-object/from16 v2, p0

    .line 78
    .line 79
    invoke-direct/range {v2 .. v16}, Lfw4;-><init>(JJJJJJJ)V

    .line 80
    .line 81
    .line 82
    iput-object v2, v0, Lqt0;->k0:Lfw4;

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_0
    return-object v1
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
.end method
