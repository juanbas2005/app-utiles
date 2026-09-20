.class public final Lwi6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lin4;


# instance fields
.field public final a:Lo81;

.field public final b:Lhl;

.field public c:Luj;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lo81;Lhl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwi6;->a:Lo81;

    .line 5
    .line 6
    iput-object p2, p0, Lwi6;->b:Lhl;

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
.end method


# virtual methods
.method public final b(Loh4;Ljava/util/List;J)Lmh4;
    .locals 11

    .line 1
    check-cast p2, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Ljava/util/List;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/util/List;

    .line 16
    .line 17
    new-instance v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    move v5, v0

    .line 31
    :goto_0
    if-ge v5, v3, :cond_0

    .line 32
    .line 33
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Lgh4;

    .line 38
    .line 39
    invoke-interface {v6, p3, p4}, Lgh4;->y(J)Leh5;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v9, 0x0

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    move-object v1, v9

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v3, v1

    .line 63
    check-cast v3, Leh5;

    .line 64
    .line 65
    iget v3, v3, Leh5;->w:I

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    sub-int/2addr v5, v2

    .line 72
    if-gt v2, v5, :cond_3

    .line 73
    .line 74
    move v6, v2

    .line 75
    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    move-object v8, v7

    .line 80
    check-cast v8, Leh5;

    .line 81
    .line 82
    iget v8, v8, Leh5;->w:I

    .line 83
    .line 84
    if-ge v3, v8, :cond_2

    .line 85
    .line 86
    move-object v1, v7

    .line 87
    move v3, v8

    .line 88
    :cond_2
    if-eq v6, v5, :cond_3

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :goto_2
    check-cast v1, Leh5;

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    iget v1, v1, Leh5;->w:I

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move v1, v0

    .line 101
    :goto_3
    new-instance v3, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    move v6, v0

    .line 115
    :goto_4
    if-ge v6, v5, :cond_5

    .line 116
    .line 117
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Lgh4;

    .line 122
    .line 123
    invoke-interface {v7, p3, p4}, Lgh4;->y(J)Leh5;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    add-int/lit8 v6, v6, 0x1

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    move-object p2, v9

    .line 140
    goto :goto_6

    .line 141
    :cond_6
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    move-object p3, p2

    .line 146
    check-cast p3, Leh5;

    .line 147
    .line 148
    iget p3, p3, Leh5;->w:I

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    sub-int/2addr p4, v2

    .line 155
    if-gt v2, p4, :cond_8

    .line 156
    .line 157
    move v5, v2

    .line 158
    :goto_5
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    move-object v7, v6

    .line 163
    check-cast v7, Leh5;

    .line 164
    .line 165
    iget v7, v7, Leh5;->w:I

    .line 166
    .line 167
    if-ge p3, v7, :cond_7

    .line 168
    .line 169
    move-object p2, v6

    .line 170
    move p3, v7

    .line 171
    :cond_7
    if-eq v5, p4, :cond_8

    .line 172
    .line 173
    add-int/lit8 v5, v5, 0x1

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_8
    :goto_6
    check-cast p2, Leh5;

    .line 177
    .line 178
    if-eqz p2, :cond_9

    .line 179
    .line 180
    iget p2, p2, Leh5;->w:I

    .line 181
    .line 182
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    goto :goto_7

    .line 187
    :cond_9
    move-object p2, v9

    .line 188
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result p3

    .line 192
    if-eqz p3, :cond_a

    .line 193
    .line 194
    move-object p3, v9

    .line 195
    goto :goto_9

    .line 196
    :cond_a
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    move-object p4, p3

    .line 201
    check-cast p4, Leh5;

    .line 202
    .line 203
    iget p4, p4, Leh5;->x:I

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    sub-int/2addr v5, v2

    .line 210
    if-gt v2, v5, :cond_c

    .line 211
    .line 212
    :goto_8
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    move-object v7, v6

    .line 217
    check-cast v7, Leh5;

    .line 218
    .line 219
    iget v7, v7, Leh5;->x:I

    .line 220
    .line 221
    if-ge p4, v7, :cond_b

    .line 222
    .line 223
    move-object p3, v6

    .line 224
    move p4, v7

    .line 225
    :cond_b
    if-eq v2, v5, :cond_c

    .line 226
    .line 227
    add-int/lit8 v2, v2, 0x1

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_c
    :goto_9
    check-cast p3, Leh5;

    .line 231
    .line 232
    if-eqz p3, :cond_d

    .line 233
    .line 234
    iget p3, p3, Leh5;->x:I

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_d
    move p3, v0

    .line 238
    :goto_a
    sget p4, Lxi6;->c:F

    .line 239
    .line 240
    invoke-interface {p1, p4}, Ltp1;->r0(F)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    const/high16 v5, 0x41000000    # 8.0f

    .line 249
    .line 250
    invoke-interface {p1, v5}, Ltp1;->r0(F)I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    add-int/2addr v6, v2

    .line 255
    if-eqz p2, :cond_e

    .line 256
    .line 257
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    goto :goto_b

    .line 262
    :cond_e
    move p2, v0

    .line 263
    :goto_b
    add-int/2addr p2, v6

    .line 264
    if-nez v1, :cond_f

    .line 265
    .line 266
    invoke-interface {p1, p4}, Ltp1;->r0(F)I

    .line 267
    .line 268
    .line 269
    move-result p4

    .line 270
    invoke-interface {p1, v5}, Ltp1;->r0(F)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    add-int/2addr v0, p4

    .line 275
    neg-int p4, v0

    .line 276
    div-int/lit8 v0, p4, 0x2

    .line 277
    .line 278
    :cond_f
    move v6, v0

    .line 279
    iget-object p4, p0, Lwi6;->d:Ljava/lang/Integer;

    .line 280
    .line 281
    if-nez p4, :cond_11

    .line 282
    .line 283
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object p4

    .line 287
    iput-object p4, p0, Lwi6;->d:Ljava/lang/Integer;

    .line 288
    .line 289
    :cond_10
    move-object v5, p0

    .line 290
    :goto_c
    move-object v7, v3

    .line 291
    goto :goto_d

    .line 292
    :cond_11
    iget-object v0, p0, Lwi6;->c:Luj;

    .line 293
    .line 294
    if-nez v0, :cond_12

    .line 295
    .line 296
    new-instance v0, Luj;

    .line 297
    .line 298
    sget-object v1, Lwe;->w:Llo7;

    .line 299
    .line 300
    const/16 v2, 0xc

    .line 301
    .line 302
    invoke-direct {v0, p4, v1, v9, v2}, Luj;-><init>(Ljava/lang/Object;Llo7;Ljava/lang/Object;I)V

    .line 303
    .line 304
    .line 305
    iput-object v0, p0, Lwi6;->c:Luj;

    .line 306
    .line 307
    :cond_12
    iget-object p4, v0, Luj;->e:Led5;

    .line 308
    .line 309
    invoke-virtual {p4}, Led5;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p4

    .line 313
    check-cast p4, Ljava/lang/Number;

    .line 314
    .line 315
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result p4

    .line 319
    if-eq p4, v6, :cond_10

    .line 320
    .line 321
    new-instance v5, Lq34;

    .line 322
    .line 323
    const/4 v10, 0x3

    .line 324
    move-object v8, p0

    .line 325
    move v7, v6

    .line 326
    move-object v6, v0

    .line 327
    invoke-direct/range {v5 .. v10}, Lq34;-><init>(Ljava/lang/Object;ILjava/lang/Object;Lf61;I)V

    .line 328
    .line 329
    .line 330
    move-object p0, v5

    .line 331
    move v6, v7

    .line 332
    move-object v5, v8

    .line 333
    const/4 p4, 0x3

    .line 334
    iget-object v0, v5, Lwi6;->a:Lo81;

    .line 335
    .line 336
    invoke-static {v0, v9, v9, p0, p4}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 337
    .line 338
    .line 339
    goto :goto_c

    .line 340
    :goto_d
    new-instance v3, Lda6;

    .line 341
    .line 342
    move v8, p3

    .line 343
    invoke-direct/range {v3 .. v8}, Lda6;-><init>(Ljava/util/ArrayList;Lwi6;ILjava/util/ArrayList;I)V

    .line 344
    .line 345
    .line 346
    sget-object p0, Lb42;->w:Lb42;

    .line 347
    .line 348
    invoke-interface {p1, p2, v8, p0, v3}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0
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
