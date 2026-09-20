.class public final synthetic Ln92;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lse7;ZLap4;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ln92;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ln92;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Ln92;->x:Z

    .line 10
    .line 11
    iput-object p3, p0, Ln92;->z:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
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

.method public synthetic constructor <init>(ZLbd5;Lbd5;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Ln92;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ln92;->x:Z

    iput-object p2, p0, Ln92;->y:Ljava/lang/Object;

    iput-object p3, p0, Ln92;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ln92;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Ln92;->z:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v2, p0, Ln92;->x:Z

    .line 6
    .line 7
    iget-object p0, p0, Ln92;->y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lse7;

    .line 13
    .line 14
    iget-object v0, p0, Lse7;->f:Led5;

    .line 15
    .line 16
    check-cast v1, Lap4;

    .line 17
    .line 18
    check-cast p1, Lml4;

    .line 19
    .line 20
    check-cast p2, Lyt2;

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const p1, -0x7f685f60

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lyt2;->e0(I)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lxy0;->n:Lt37;

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object p3, Ley3;->x:Ley3;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    const/4 v4, 0x0

    .line 43
    if-ne p1, p3, :cond_0

    .line 44
    .line 45
    move p1, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p1, v4

    .line 48
    :goto_0
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    check-cast p3, Lz75;

    .line 53
    .line 54
    sget-object v5, Lz75;->w:Lz75;

    .line 55
    .line 56
    if-eq p3, v5, :cond_2

    .line 57
    .line 58
    if-nez p1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move p1, v4

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    move p1, v3

    .line 64
    :goto_2
    invoke-virtual {p2, p0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    sget-object v6, Lay0;->a:Ld63;

    .line 73
    .line 74
    if-nez p3, :cond_3

    .line 75
    .line 76
    if-ne v5, v6, :cond_4

    .line 77
    .line 78
    :cond_3
    new-instance v5, Lay5;

    .line 79
    .line 80
    const/16 p3, 0x17

    .line 81
    .line 82
    invoke-direct {v5, p3, p0}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v5}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    check-cast v5, Lvr2;

    .line 89
    .line 90
    invoke-static {v5, p2}, Lu55;->v(Ljava/lang/Object;Lyt2;)Laq4;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-ne v5, v6, :cond_5

    .line 99
    .line 100
    new-instance v5, Lt46;

    .line 101
    .line 102
    invoke-direct {v5, p3, v3}, Lt46;-><init>(Laq4;I)V

    .line 103
    .line 104
    .line 105
    new-instance p3, Lhn1;

    .line 106
    .line 107
    invoke-direct {p3, v5}, Lhn1;-><init>(Lvr2;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, p3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v5, p3

    .line 114
    :cond_5
    check-cast v5, Luh6;

    .line 115
    .line 116
    invoke-virtual {p2, v5}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    invoke-virtual {p2, p0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    or-int/2addr p3, v7

    .line 125
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    if-nez p3, :cond_6

    .line 130
    .line 131
    if-ne v7, v6, :cond_7

    .line 132
    .line 133
    :cond_6
    new-instance v7, Lre7;

    .line 134
    .line 135
    invoke-direct {v7, v5, p0}, Lre7;-><init>(Luh6;Lse7;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    check-cast v7, Lre7;

    .line 142
    .line 143
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    check-cast p3, Lz75;

    .line 148
    .line 149
    if-eqz v2, :cond_8

    .line 150
    .line 151
    iget-object p0, p0, Lse7;->b:Lad5;

    .line 152
    .line 153
    invoke-virtual {p0}, Lad5;->d()F

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    const/4 v0, 0x0

    .line 158
    cmpg-float p0, p0, v0

    .line 159
    .line 160
    if-nez p0, :cond_9

    .line 161
    .line 162
    :cond_8
    move v3, v4

    .line 163
    :cond_9
    invoke-static {v7, p3, v3, p1, v1}, Lmh6;->b(Lre7;Lz75;ZZLap4;)Lml4;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p2, v4}, Lyt2;->r(Z)V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_0
    check-cast p0, Lbd5;

    .line 172
    .line 173
    check-cast v1, Lbd5;

    .line 174
    .line 175
    check-cast p1, Loh4;

    .line 176
    .line 177
    check-cast p2, Lgh4;

    .line 178
    .line 179
    check-cast p3, Lk31;

    .line 180
    .line 181
    iget-wide v3, p3, Lk31;->a:J

    .line 182
    .line 183
    invoke-virtual {p0}, Lbd5;->d()I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-static {v3, v4, p0}, Lm31;->g(JI)I

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    iget-wide v3, p3, Lk31;->a:J

    .line 192
    .line 193
    invoke-virtual {v1}, Lbd5;->d()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-static {v3, v4, v0}, Lm31;->f(JI)I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    if-eqz v2, :cond_a

    .line 202
    .line 203
    move v7, p0

    .line 204
    goto :goto_3

    .line 205
    :cond_a
    invoke-static {v3, v4}, Lk31;->j(J)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    move v7, v0

    .line 210
    :goto_3
    if-eqz v2, :cond_b

    .line 211
    .line 212
    :goto_4
    move v8, p0

    .line 213
    goto :goto_5

    .line 214
    :cond_b
    invoke-static {v3, v4}, Lk31;->h(J)I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    goto :goto_4

    .line 219
    :goto_5
    iget-wide v5, p3, Lk31;->a:J

    .line 220
    .line 221
    const/4 v9, 0x0

    .line 222
    const/4 v11, 0x4

    .line 223
    invoke-static/range {v5 .. v11}, Lk31;->a(JIIIII)J

    .line 224
    .line 225
    .line 226
    move-result-wide v0

    .line 227
    invoke-interface {p2, v0, v1}, Lgh4;->y(J)Leh5;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    iget p2, p0, Leh5;->w:I

    .line 232
    .line 233
    iget p3, p0, Leh5;->x:I

    .line 234
    .line 235
    new-instance v0, Lws;

    .line 236
    .line 237
    const/4 v1, 0x5

    .line 238
    invoke-direct {v0, p0, v1}, Lws;-><init>(Leh5;I)V

    .line 239
    .line 240
    .line 241
    sget-object p0, Lb42;->w:Lb42;

    .line 242
    .line 243
    invoke-interface {p1, p2, p3, p0, v0}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
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
