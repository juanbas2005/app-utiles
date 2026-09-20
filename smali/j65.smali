.class public final Lj65;
.super Lvg2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final e:Lj65;

.field public static final f:Lj65;

.field public static final g:Lj65;

.field public static final h:Lj65;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lj65;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lj65;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lj65;->e:Lj65;

    .line 10
    .line 11
    new-instance v0, Lj65;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, v1, v1, v2}, Lj65;-><init>(III)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lj65;->f:Lj65;

    .line 19
    .line 20
    new-instance v0, Lj65;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v0, v3, v1, v2}, Lj65;-><init>(III)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lj65;->g:Lj65;

    .line 28
    .line 29
    new-instance v0, Lj65;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-direct {v0, v1, v1, v2}, Lj65;-><init>(III)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lj65;->h:Lj65;

    .line 37
    .line 38
    return-void
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

.method public synthetic constructor <init>(III)V
    .locals 1

    .line 1
    iput p3, p0, Lj65;->d:I

    .line 2
    .line 3
    const/4 p3, 0x2

    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3, v0}, Lvg2;-><init>(IIIB)V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final d(Ltt2;Lkr;Ljv6;Lu36;Lf75;)V
    .locals 1

    .line 1
    iget p0, p0, Lj65;->d:I

    .line 2
    .line 3
    const/4 p5, 0x1

    .line 4
    const/4 v0, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ltt2;->f(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, v0}, Ltt2;->e(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    instance-of p2, p0, Lcu2;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    move-object p2, p0

    .line 21
    check-cast p2, Lcu2;

    .line 22
    .line 23
    iget-object p5, p4, Lu36;->e:Leq4;

    .line 24
    .line 25
    invoke-virtual {p5, p2}, Leq4;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p5, p4, Lu36;->d:Lup4;

    .line 29
    .line 30
    invoke-virtual {p5, p2}, Lup4;->a(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    iget p2, p3, Ljv6;->t:I

    .line 34
    .line 35
    invoke-virtual {p3, p2, p1, p0}, Ljv6;->M(IILjava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    instance-of p1, p0, Lcu2;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    check-cast p0, Lcu2;

    .line 44
    .line 45
    invoke-virtual {p4, p0}, Lu36;->e(Lcu2;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    instance-of p1, p0, Lyx5;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    check-cast p0, Lyx5;

    .line 54
    .line 55
    invoke-virtual {p0}, Lyx5;->c()V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void

    .line 59
    :pswitch_0
    invoke-virtual {p1, v0}, Ltt2;->f(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, p5}, Ltt2;->f(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Lst2;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ltt2;->e(I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    instance-of p5, p0, Lcu2;

    .line 74
    .line 75
    if-eqz p5, :cond_3

    .line 76
    .line 77
    move-object p5, p0

    .line 78
    check-cast p5, Lcu2;

    .line 79
    .line 80
    iget-object v0, p4, Lu36;->e:Leq4;

    .line 81
    .line 82
    invoke-virtual {v0, p5}, Leq4;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p4, Lu36;->d:Lup4;

    .line 86
    .line 87
    invoke-virtual {v0, p5}, Lup4;->a(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p3, p2}, Ljv6;->c(Lst2;)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p3, p2, p1, p0}, Ljv6;->M(IILjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    instance-of p1, p0, Lcu2;

    .line 99
    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    check-cast p0, Lcu2;

    .line 103
    .line 104
    invoke-virtual {p4, p0}, Lu36;->e(Lcu2;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    instance-of p1, p0, Lyx5;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    check-cast p0, Lyx5;

    .line 113
    .line 114
    invoke-virtual {p0}, Lyx5;->c()V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_1
    return-void

    .line 118
    :pswitch_1
    invoke-virtual {p1, v0}, Ltt2;->f(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Lst2;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Ltt2;->e(I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-interface {p2}, Lkr;->i()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p3, p0}, Ljv6;->c(Lst2;)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-virtual {p3, p0}, Ljv6;->E(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-interface {p2, p1, p0}, Lkr;->b(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_2
    invoke-virtual {p1, v0}, Ltt2;->f(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lsr2;

    .line 151
    .line 152
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p1, p5}, Ltt2;->f(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    check-cast p4, Lst2;

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ltt2;->e(I)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p3, p4}, Ljv6;->c(Lst2;)I

    .line 170
    .line 171
    .line 172
    move-result p4

    .line 173
    invoke-virtual {p3, p4, p0}, Ljv6;->X(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {p2, p1, p0}, Lkr;->k(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p2, p0}, Lkr;->c(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method

.method public f(Ltt2;)Lst2;
    .locals 1

    .line 1
    iget v0, p0, Lj65;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lvg2;->f(Ltt2;)Lst2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const/4 p0, 0x0

    .line 12
    invoke-virtual {p1, p0}, Ltt2;->f(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lst2;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_1
    const/4 p0, 0x1

    .line 20
    invoke-virtual {p1, p0}, Ltt2;->f(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lst2;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
.end method
