.class public final Ldp3;
.super Lt49;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final f:Lcr5;

.field public final g:Lqs5;

.field public final h:Lkp3;

.field public final i:Lvq4;

.field public final j:Lwv1;

.field public final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcr5;Lqs5;Lkp3;Lvq4;Lwv1;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldp3;->f:Lcr5;

    .line 14
    .line 15
    iput-object p2, p0, Ldp3;->g:Lqs5;

    .line 16
    .line 17
    iput-object p3, p0, Ldp3;->h:Lkp3;

    .line 18
    .line 19
    iput-object p4, p0, Ldp3;->i:Lvq4;

    .line 20
    .line 21
    iput-object p5, p0, Ldp3;->j:Lwv1;

    .line 22
    .line 23
    invoke-virtual {p3}, Lkp3;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object p1, p3, Lkp3;->A:Lip3;

    .line 30
    .line 31
    iget p1, p1, Lip3;->y:I

    .line 32
    .line 33
    invoke-interface {p4, p1}, Lvq4;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p2, p3, Lkp3;->A:Lip3;

    .line 38
    .line 39
    iget p2, p2, Lip3;->z:I

    .line 40
    .line 41
    invoke-interface {p4, p2}, Lvq4;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_0
    sget-object p3, Lrp3;->a:Ly92;

    .line 52
    .line 53
    const/4 p3, 0x1

    .line 54
    invoke-static {p2, p4, p5, p3}, Lrp3;->b(Lqs5;Lvq4;Lwv1;Z)Lpo3;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const/4 p3, 0x0

    .line 59
    if-eqz p2, :cond_5

    .line 60
    .line 61
    iget-object p5, p2, Lpo3;->t:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p2, p2, Lpo3;->u:Ljava/lang/String;

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {p5}, Lmn3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p5

    .line 74
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Lvj1;->r()Lvj1;

    .line 78
    .line 79
    .line 80
    move-result-object p5

    .line 81
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Lzh4;->f()Lus1;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget-object v2, Lvs1;->d:Lus1;

    .line 89
    .line 90
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const-string v2, "$"

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    instance-of v1, p5, Lgt1;

    .line 99
    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    check-cast p5, Lgt1;

    .line 103
    .line 104
    iget-object p1, p5, Lgt1;->A:Ltr5;

    .line 105
    .line 106
    sget-object p3, Lqp3;->g:Lyu2;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {p1, p3}, Ljb5;->n(Lwu2;Lyu2;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Ljava/lang/Integer;

    .line 116
    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-interface {p4, p1}, Lvq4;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    goto :goto_0

    .line 128
    :cond_1
    const-string p1, "main"

    .line 129
    .line 130
    :goto_0
    sget-object p3, Lxq4;->a:Lk26;

    .line 131
    .line 132
    const-string p4, "_"

    .line 133
    .line 134
    invoke-virtual {p3, p1, p4}, Lk26;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    invoke-interface {p1}, Lzh4;->f()Lus1;

    .line 144
    .line 145
    .line 146
    move-result-object p4

    .line 147
    sget-object v1, Lvs1;->a:Lus1;

    .line 148
    .line 149
    invoke-static {p4, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p4

    .line 153
    if-eqz p4, :cond_4

    .line 154
    .line 155
    instance-of p4, p5, Lx95;

    .line 156
    .line 157
    if-eqz p4, :cond_4

    .line 158
    .line 159
    check-cast p1, Lst1;

    .line 160
    .line 161
    iget-object p1, p1, Lst1;->a0:Lit1;

    .line 162
    .line 163
    instance-of p4, p1, Lwo3;

    .line 164
    .line 165
    if-eqz p4, :cond_4

    .line 166
    .line 167
    check-cast p1, Lwo3;

    .line 168
    .line 169
    iget-object p4, p1, Lwo3;->x:Lco3;

    .line 170
    .line 171
    if-eqz p4, :cond_4

    .line 172
    .line 173
    new-instance p4, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p1, Lwo3;->w:Lco3;

    .line 179
    .line 180
    iget-object p1, p1, Lco3;->a:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz p1, :cond_3

    .line 183
    .line 184
    const/16 p3, 0x2f

    .line 185
    .line 186
    invoke-static {p3, p1, p1}, Ld57;->d1(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Luq4;->b()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    goto :goto_1

    .line 206
    :cond_3
    const/16 p0, 0xa

    .line 207
    .line 208
    invoke-static {p0}, Lco3;->a(I)V

    .line 209
    .line 210
    .line 211
    throw p3

    .line 212
    :cond_4
    const-string p1, ""

    .line 213
    .line 214
    :goto_1
    const-string p3, "()"

    .line 215
    .line 216
    invoke-static {v0, p1, p3, p2}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    :goto_2
    iput-object p1, p0, Ldp3;->k:Ljava/lang/String;

    .line 221
    .line 222
    return-void

    .line 223
    :cond_5
    const-string p0, "No field signature for property: "

    .line 224
    .line 225
    invoke-static {p0, p1}, Lrf2;->x(Ljava/lang/String;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    throw p3
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


# virtual methods
.method public final s()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldp3;->k:Ljava/lang/String;

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
