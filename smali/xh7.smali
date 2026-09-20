.class public final Lxh7;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmy3;


# instance fields
.field public K:Lef3;

.field public L:Z

.field public M:Lje2;

.field public N:Z

.field public O:Luj;

.field public P:Luj;

.field public Q:F

.field public R:F


# virtual methods
.method public final K0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

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

.method public final N0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lll4;->J0()Lo81;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lgw6;

    .line 6
    .line 7
    const/4 v2, 0x7

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lgw6;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v3, v1, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final P0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lxh7;->O:Luj;

    .line 3
    .line 4
    iput-object v0, p0, Lxh7;->P:Luj;

    .line 5
    .line 6
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    iput v0, p0, Lxh7;->R:F

    .line 9
    .line 10
    iput v0, p0, Lxh7;->Q:F

    .line 11
    .line 12
    return-void
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

.method public final c(Loh4;Lgh4;J)Lmh4;
    .locals 7

    .line 1
    sget v0, Lr16;->L:F

    .line 2
    .line 3
    invoke-static {p3, p4}, Lk31;->h(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {p2, v1}, Lgh4;->c(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {p3, p4}, Lk31;->g(J)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-interface {p2, p3}, Lgh4;->v(I)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    move p3, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p3, v2

    .line 28
    :goto_0
    iget-boolean p4, p0, Lxh7;->N:Z

    .line 29
    .line 30
    if-eqz p4, :cond_1

    .line 31
    .line 32
    sget p3, Lr16;->E:F

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    if-nez p3, :cond_3

    .line 36
    .line 37
    iget-boolean p3, p0, Lxh7;->L:Z

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    sget p3, Lp97;->b:F

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    :goto_1
    sget p3, Lp97;->a:F

    .line 46
    .line 47
    :goto_2
    invoke-interface {p1, p3}, Ltp1;->e0(F)F

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    iget-object p4, p0, Lxh7;->P:Luj;

    .line 52
    .line 53
    if-eqz p4, :cond_4

    .line 54
    .line 55
    invoke-virtual {p4}, Luj;->d()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    check-cast p4, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move p4, p3

    .line 67
    :goto_3
    float-to-int p4, p4

    .line 68
    if-ltz p4, :cond_5

    .line 69
    .line 70
    move v1, v3

    .line 71
    goto :goto_4

    .line 72
    :cond_5
    move v1, v2

    .line 73
    :goto_4
    if-ltz p4, :cond_6

    .line 74
    .line 75
    move v4, v3

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move v4, v2

    .line 78
    :goto_5
    and-int/2addr v1, v4

    .line 79
    if-nez v1, :cond_7

    .line 80
    .line 81
    const-string v1, "width and height must be >= 0"

    .line 82
    .line 83
    invoke-static {v1}, Lac3;->a(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_7
    invoke-static {p4, p4, p4, p4}, Lm31;->h(IIII)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    invoke-interface {p2, v4, v5}, Lgh4;->y(J)Leh5;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    sget v1, Lp97;->d:F

    .line 95
    .line 96
    invoke-interface {p1, p3}, Ltp1;->S(F)F

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    sub-float/2addr v1, v4

    .line 101
    const/high16 v4, 0x40000000    # 2.0f

    .line 102
    .line 103
    div-float/2addr v1, v4

    .line 104
    invoke-interface {p1, v1}, Ltp1;->e0(F)F

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    sget v4, Lp97;->c:F

    .line 109
    .line 110
    sget v5, Lp97;->a:F

    .line 111
    .line 112
    sub-float/2addr v4, v5

    .line 113
    sget v5, Lp97;->e:F

    .line 114
    .line 115
    sub-float/2addr v4, v5

    .line 116
    invoke-interface {p1, v4}, Ltp1;->e0(F)F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    iget-boolean v5, p0, Lxh7;->N:Z

    .line 121
    .line 122
    if-eqz v5, :cond_8

    .line 123
    .line 124
    iget-boolean v6, p0, Lxh7;->L:Z

    .line 125
    .line 126
    if-eqz v6, :cond_8

    .line 127
    .line 128
    invoke-interface {p1, v0}, Ltp1;->e0(F)F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    sub-float v1, v4, v0

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_8
    if-eqz v5, :cond_9

    .line 136
    .line 137
    iget-boolean v5, p0, Lxh7;->L:Z

    .line 138
    .line 139
    if-nez v5, :cond_9

    .line 140
    .line 141
    invoke-interface {p1, v0}, Ltp1;->e0(F)F

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    goto :goto_6

    .line 146
    :cond_9
    iget-boolean v0, p0, Lxh7;->L:Z

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    move v1, v4

    .line 151
    :cond_a
    :goto_6
    iget-object v0, p0, Lxh7;->P:Luj;

    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    if-eqz v0, :cond_b

    .line 155
    .line 156
    iget-object v0, v0, Luj;->e:Led5;

    .line 157
    .line 158
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Ljava/lang/Float;

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_b
    move-object v0, v4

    .line 166
    :goto_7
    const/4 v5, 0x3

    .line 167
    if-eqz v0, :cond_c

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    cmpl-float v0, v0, p3

    .line 174
    .line 175
    if-nez v0, :cond_c

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_c
    invoke-virtual {p0}, Lll4;->J0()Lo81;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v6, Lwh7;

    .line 183
    .line 184
    invoke-direct {v6, p0, p3, v4, v2}, Lwh7;-><init>(Lxh7;FLf61;I)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v4, v4, v6, v5}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 188
    .line 189
    .line 190
    :goto_8
    iget-object v0, p0, Lxh7;->O:Luj;

    .line 191
    .line 192
    if-eqz v0, :cond_d

    .line 193
    .line 194
    iget-object v0, v0, Luj;->e:Led5;

    .line 195
    .line 196
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Ljava/lang/Float;

    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_d
    move-object v0, v4

    .line 204
    :goto_9
    if-eqz v0, :cond_e

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    cmpl-float v0, v0, v1

    .line 211
    .line 212
    if-nez v0, :cond_e

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_e
    invoke-virtual {p0}, Lll4;->J0()Lo81;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v2, Lwh7;

    .line 220
    .line 221
    invoke-direct {v2, p0, v1, v4, v3}, Lwh7;-><init>(Lxh7;FLf61;I)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v4, v4, v2, v5}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 225
    .line 226
    .line 227
    :goto_a
    iget v0, p0, Lxh7;->R:F

    .line 228
    .line 229
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_f

    .line 234
    .line 235
    iget v0, p0, Lxh7;->Q:F

    .line 236
    .line 237
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_f

    .line 242
    .line 243
    iput p3, p0, Lxh7;->R:F

    .line 244
    .line 245
    iput v1, p0, Lxh7;->Q:F

    .line 246
    .line 247
    :cond_f
    new-instance p3, Ljf;

    .line 248
    .line 249
    invoke-direct {p3, p2, p0, v1}, Ljf;-><init>(Leh5;Lxh7;F)V

    .line 250
    .line 251
    .line 252
    sget-object p0, Lb42;->w:Lb42;

    .line 253
    .line 254
    invoke-interface {p1, p4, p4, p0, p3}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0
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
