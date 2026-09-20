.class public final Lfm0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Map;
.implements Ler3;


# static fields
.field public static final E:[Ljava/lang/String;

.field public static final F:[Ljava/lang/Object;

.field public static final G:[I


# instance fields
.field public A:I

.field public B:Lcm0;

.field public C:Lcm0;

.field public D:Lem0;

.field public w:[Ljava/lang/String;

.field public x:[Ljava/lang/Object;

.field public y:I

.field public z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v1, Lfm0;->E:[Ljava/lang/String;

    .line 5
    .line 6
    new-array v1, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    sput-object v1, Lfm0;->F:[Ljava/lang/Object;

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    sput-object v0, Lfm0;->G:[I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget v0, p0, Lfm0;->y:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {p1}, Lme6;->i(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 17
    .line 18
    aget-object v1, v1, v0

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    :goto_1
    const/4 p0, -0x1

    .line 23
    return p0

    .line 24
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 34
    .line 35
    array-length v1, v1

    .line 36
    goto :goto_0
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
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lfm0;->w:[Ljava/lang/String;

    .line 8
    .line 9
    sget-object v1, Lfm0;->E:[Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    new-array v1, v0, [Ljava/lang/String;

    .line 18
    .line 19
    iput-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 20
    .line 21
    new-array v1, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v1, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 24
    .line 25
    new-array v1, v0, [I

    .line 26
    .line 27
    move v4, v3

    .line 28
    :goto_0
    if-ge v4, v0, :cond_0

    .line 29
    .line 30
    aput v2, v1, v4

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput-object v1, p0, Lfm0;->z:[I

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, Lme6;->i(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 42
    .line 43
    array-length v1, v1

    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    and-int/2addr v1, v0

    .line 47
    :goto_1
    iget-object v4, p0, Lfm0;->w:[Ljava/lang/String;

    .line 48
    .line 49
    aget-object v4, v4, v1

    .line 50
    .line 51
    if-nez v4, :cond_b

    .line 52
    .line 53
    iget v1, p0, Lfm0;->y:I

    .line 54
    .line 55
    mul-int/lit8 v1, v1, 0x4

    .line 56
    .line 57
    iget-object v4, p0, Lfm0;->w:[Ljava/lang/String;

    .line 58
    .line 59
    array-length v5, v4

    .line 60
    mul-int/lit8 v5, v5, 0x3

    .line 61
    .line 62
    if-lt v1, v5, :cond_4

    .line 63
    .line 64
    array-length v1, v4

    .line 65
    mul-int/lit8 v1, v1, 0x2

    .line 66
    .line 67
    iget-object v5, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 68
    .line 69
    iget-object v6, p0, Lfm0;->z:[I

    .line 70
    .line 71
    iget v7, p0, Lfm0;->A:I

    .line 72
    .line 73
    new-array v8, v1, [Ljava/lang/String;

    .line 74
    .line 75
    iput-object v8, p0, Lfm0;->w:[Ljava/lang/String;

    .line 76
    .line 77
    new-array v8, v1, [Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v8, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 80
    .line 81
    new-array v8, v1, [I

    .line 82
    .line 83
    move v9, v3

    .line 84
    :goto_2
    if-ge v9, v1, :cond_2

    .line 85
    .line 86
    aput v2, v8, v9

    .line 87
    .line 88
    add-int/lit8 v9, v9, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    iput-object v8, p0, Lfm0;->z:[I

    .line 92
    .line 93
    iput v3, p0, Lfm0;->y:I

    .line 94
    .line 95
    iput v3, p0, Lfm0;->A:I

    .line 96
    .line 97
    move v1, v3

    .line 98
    :goto_3
    if-ge v1, v7, :cond_4

    .line 99
    .line 100
    aget v8, v6, v1

    .line 101
    .line 102
    if-ltz v8, :cond_3

    .line 103
    .line 104
    aget-object v9, v4, v8

    .line 105
    .line 106
    if-eqz v9, :cond_3

    .line 107
    .line 108
    aget-object v8, v5, v8

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v9, v8}, Lfm0;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 120
    .line 121
    array-length v1, v1

    .line 122
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 123
    .line 124
    and-int/2addr v0, v1

    .line 125
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 126
    .line 127
    aget-object v4, v1, v0

    .line 128
    .line 129
    if-eqz v4, :cond_5

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    array-length v1, v1

    .line 134
    goto :goto_4

    .line 135
    :cond_5
    iget v1, p0, Lfm0;->A:I

    .line 136
    .line 137
    iget-object v4, p0, Lfm0;->z:[I

    .line 138
    .line 139
    array-length v4, v4

    .line 140
    if-ne v1, v4, :cond_a

    .line 141
    .line 142
    if-nez v1, :cond_6

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_6
    move v4, v3

    .line 146
    :goto_5
    iget-object v5, p0, Lfm0;->z:[I

    .line 147
    .line 148
    if-ge v3, v1, :cond_8

    .line 149
    .line 150
    aget v6, v5, v3

    .line 151
    .line 152
    if-ltz v6, :cond_7

    .line 153
    .line 154
    iget-object v7, p0, Lfm0;->w:[Ljava/lang/String;

    .line 155
    .line 156
    aget-object v7, v7, v6

    .line 157
    .line 158
    if-eqz v7, :cond_7

    .line 159
    .line 160
    add-int/lit8 v7, v4, 0x1

    .line 161
    .line 162
    aput v6, v5, v4

    .line 163
    .line 164
    move v4, v7

    .line 165
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    array-length v1, v5

    .line 169
    move v3, v4

    .line 170
    :goto_6
    if-ge v3, v1, :cond_9

    .line 171
    .line 172
    iget-object v5, p0, Lfm0;->z:[I

    .line 173
    .line 174
    aput v2, v5, v3

    .line 175
    .line 176
    add-int/lit8 v3, v3, 0x1

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    iput v4, p0, Lfm0;->A:I

    .line 180
    .line 181
    :cond_a
    :goto_7
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 182
    .line 183
    aput-object p1, v1, v0

    .line 184
    .line 185
    iget-object p1, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 186
    .line 187
    aput-object p2, p1, v0

    .line 188
    .line 189
    iget-object p1, p0, Lfm0;->z:[I

    .line 190
    .line 191
    iget p2, p0, Lfm0;->A:I

    .line 192
    .line 193
    add-int/lit8 v1, p2, 0x1

    .line 194
    .line 195
    iput v1, p0, Lfm0;->A:I

    .line 196
    .line 197
    aput v0, p1, p2

    .line 198
    .line 199
    iget p1, p0, Lfm0;->y:I

    .line 200
    .line 201
    add-int/lit8 p1, p1, 0x1

    .line 202
    .line 203
    iput p1, p0, Lfm0;->y:I

    .line 204
    .line 205
    const/4 p0, 0x0

    .line 206
    return-object p0

    .line 207
    :cond_b
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_c

    .line 212
    .line 213
    iget-object p0, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 214
    .line 215
    aget-object p1, p0, v1

    .line 216
    .line 217
    aput-object p2, p0, v1

    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 221
    .line 222
    iget-object v4, p0, Lfm0;->w:[Ljava/lang/String;

    .line 223
    .line 224
    array-length v4, v4

    .line 225
    add-int/lit8 v4, v4, -0x1

    .line 226
    .line 227
    and-int/2addr v1, v4

    .line 228
    goto/16 :goto_1
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final clear()V
    .locals 4

    .line 1
    iget v0, p0, Lfm0;->y:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lfm0;->w:[Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Lqs;->U0([Ljava/lang/Object;Lpy2;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lqs;->U0([Ljava/lang/Object;Lpy2;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lfm0;->z:[I

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, -0x1

    .line 24
    invoke-static {v0, v2, v1, v3}, Ljava/util/Arrays;->fill([IIII)V

    .line 25
    .line 26
    .line 27
    iput v2, p0, Lfm0;->y:I

    .line 28
    .line 29
    iput v2, p0, Lfm0;->A:I

    .line 30
    .line 31
    :cond_0
    return-void
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

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lfm0;->a(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ltz p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    return v1
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
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget v1, p0, Lfm0;->y:I

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    return v0

    .line 10
    :cond_1
    iget-object v1, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    move v2, v0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_3

    .line 15
    .line 16
    iget-object v3, p0, Lfm0;->w:[Ljava/lang/String;

    .line 17
    .line 18
    aget-object v3, v3, v2

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    iget-object v3, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 23
    .line 24
    aget-object v3, v3, v2

    .line 25
    .line 26
    invoke-static {v3, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return v0
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
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Lfm0;->C:Lcm0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcm0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lcm0;-><init>(Lfm0;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lfm0;->C:Lcm0;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lfm0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lfm0;

    .line 12
    .line 13
    iget v1, p1, Lfm0;->y:I

    .line 14
    .line 15
    iget v3, p0, Lfm0;->y:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lfm0;->w:[Ljava/lang/String;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_4

    .line 25
    .line 26
    iget-object v4, p0, Lfm0;->w:[Ljava/lang/String;

    .line 27
    .line 28
    aget-object v4, v4, v3

    .line 29
    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    iget-object v5, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 33
    .line 34
    aget-object v5, v5, v3

    .line 35
    .line 36
    invoke-virtual {p1, v4}, Lfm0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    return v0
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

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lfm0;->a(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-ltz p1, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 16
    .line 17
    aget-object p0, p0, p1

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    return-object v1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lfm0;->w:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v2, v0, :cond_2

    .line 8
    .line 9
    iget-object v4, p0, Lfm0;->w:[Ljava/lang/String;

    .line 10
    .line 11
    aget-object v4, v4, v2

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    invoke-static {v4}, Lme6;->i(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v5, v5, v2

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v5, v1

    .line 31
    :goto_1
    xor-int/2addr v4, v5

    .line 32
    add-int/2addr v3, v4

    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v3
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

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lfm0;->y:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Lfm0;->B:Lcm0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcm0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p0, v1}, Lcm0;-><init>(Lfm0;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lfm0;->B:Lcm0;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lfm0;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v1, v0}, Lfm0;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
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

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lfm0;->a(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-gez p1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-object v1

    .line 16
    :cond_1
    iget-object v0, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v0, v0, p1

    .line 19
    .line 20
    iget v2, p0, Lfm0;->A:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_1
    const/4 v5, -0x1

    .line 25
    if-ge v4, v2, :cond_3

    .line 26
    .line 27
    iget-object v6, p0, Lfm0;->z:[I

    .line 28
    .line 29
    aget v7, v6, v4

    .line 30
    .line 31
    if-ne v7, p1, :cond_2

    .line 32
    .line 33
    aput v5, v6, v4

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    iget-object v2, p0, Lfm0;->w:[Ljava/lang/String;

    .line 40
    .line 41
    aput-object v1, v2, p1

    .line 42
    .line 43
    iget-object v4, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 44
    .line 45
    aput-object v1, v4, p1

    .line 46
    .line 47
    iget v4, p0, Lfm0;->y:I

    .line 48
    .line 49
    add-int/2addr v4, v5

    .line 50
    iput v4, p0, Lfm0;->y:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    array-length v2, v2

    .line 55
    :goto_3
    add-int/lit8 v2, v2, -0x1

    .line 56
    .line 57
    and-int/2addr p1, v2

    .line 58
    iget-object v2, p0, Lfm0;->w:[Ljava/lang/String;

    .line 59
    .line 60
    aget-object v4, v2, p1

    .line 61
    .line 62
    if-eqz v4, :cond_8

    .line 63
    .line 64
    iget-object v6, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 65
    .line 66
    aget-object v7, v6, p1

    .line 67
    .line 68
    aput-object v1, v2, p1

    .line 69
    .line 70
    aput-object v1, v6, p1

    .line 71
    .line 72
    iget v2, p0, Lfm0;->y:I

    .line 73
    .line 74
    add-int/2addr v2, v5

    .line 75
    iput v2, p0, Lfm0;->y:I

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v4}, Lme6;->i(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    iget-object v6, p0, Lfm0;->w:[Ljava/lang/String;

    .line 85
    .line 86
    array-length v6, v6

    .line 87
    :goto_4
    add-int/lit8 v6, v6, -0x1

    .line 88
    .line 89
    and-int/2addr v2, v6

    .line 90
    iget-object v6, p0, Lfm0;->w:[Ljava/lang/String;

    .line 91
    .line 92
    aget-object v8, v6, v2

    .line 93
    .line 94
    if-nez v8, :cond_4

    .line 95
    .line 96
    aput-object v4, v6, v2

    .line 97
    .line 98
    iget-object v4, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 99
    .line 100
    aput-object v7, v4, v2

    .line 101
    .line 102
    iget v4, p0, Lfm0;->y:I

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    iput v4, p0, Lfm0;->y:I

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_4
    invoke-virtual {v8, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_7

    .line 114
    .line 115
    iget-object v4, p0, Lfm0;->x:[Ljava/lang/Object;

    .line 116
    .line 117
    aput-object v7, v4, v2

    .line 118
    .line 119
    :goto_5
    iget v4, p0, Lfm0;->A:I

    .line 120
    .line 121
    move v6, v3

    .line 122
    :goto_6
    if-ge v6, v4, :cond_6

    .line 123
    .line 124
    iget-object v7, p0, Lfm0;->z:[I

    .line 125
    .line 126
    aget v8, v7, v6

    .line 127
    .line 128
    if-ne v8, p1, :cond_5

    .line 129
    .line 130
    aput v2, v7, v6

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_6
    :goto_7
    add-int/lit8 p1, p1, 0x1

    .line 137
    .line 138
    iget-object v2, p0, Lfm0;->w:[Ljava/lang/String;

    .line 139
    .line 140
    array-length v2, v2

    .line 141
    goto :goto_3

    .line 142
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    iget-object v6, p0, Lfm0;->w:[Ljava/lang/String;

    .line 145
    .line 146
    array-length v6, v6

    .line 147
    goto :goto_4

    .line 148
    :cond_8
    return-object v0
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

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lfm0;->y:I

    .line 2
    .line 3
    return p0
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

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lfm0;->D:Lem0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lem0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lem0;-><init>(Lfm0;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lfm0;->D:Lem0;

    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
