.class public final Lta5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfc0;


# instance fields
.field public final b:Lob5;

.field public final c:Lfc0;

.field public final d:Ley3;


# direct methods
.method public constructor <init>(Lob5;Lfc0;Ley3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lta5;->b:Lob5;

    .line 5
    .line 6
    iput-object p2, p0, Lta5;->c:Lfc0;

    .line 7
    .line 8
    iput-object p3, p0, Lta5;->d:Ley3;

    .line 9
    .line 10
    return-void
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
.method public final a(FFF)F
    .locals 10

    .line 1
    iget-object v0, p0, Lta5;->c:Lfc0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lfc0;->a(FFF)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v2, p1, v1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    add-float/2addr p1, p2

    .line 15
    cmpl-float p1, p1, p3

    .line 16
    .line 17
    if-lez p1, :cond_1

    .line 18
    .line 19
    :goto_0
    move v3, v4

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    add-float/2addr p1, p2

    .line 22
    sget-object p2, Ll78;->a:Ljava/util/Map;

    .line 23
    .line 24
    const/high16 p2, 0x3f800000    # 1.0f

    .line 25
    .line 26
    cmpg-float p1, p1, p2

    .line 27
    .line 28
    if-gtz p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    cmpg-float p1, p1, v1

    .line 36
    .line 37
    sget-object p2, Ley3;->x:Ley3;

    .line 38
    .line 39
    sget-object v2, Lz75;->x:Lz75;

    .line 40
    .line 41
    iget-object v4, p0, Lta5;->d:Ley3;

    .line 42
    .line 43
    const/high16 v5, -0x40800000    # -1.0f

    .line 44
    .line 45
    iget-object p0, p0, Lta5;->b:Lob5;

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_5

    .line 50
    :cond_2
    if-eqz v3, :cond_6

    .line 51
    .line 52
    if-ne v4, p2, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, Ldb5;->e:Lz75;

    .line 59
    .line 60
    if-ne p1, v2, :cond_3

    .line 61
    .line 62
    iget p1, p0, Lob5;->f:I

    .line 63
    .line 64
    neg-int p1, p1

    .line 65
    invoke-virtual {p0}, Lob5;->p()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    add-int/2addr p2, p1

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    iget p2, p0, Lob5;->f:I

    .line 72
    .line 73
    :goto_2
    int-to-float p1, p2

    .line 74
    mul-float/2addr p1, v5

    .line 75
    :goto_3
    cmpl-float p2, v0, v1

    .line 76
    .line 77
    if-lez p2, :cond_4

    .line 78
    .line 79
    cmpg-float p2, p1, v0

    .line 80
    .line 81
    if-gez p2, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0}, Lob5;->p()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    int-to-float p2, p2

    .line 88
    add-float/2addr p1, p2

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    :goto_4
    cmpg-float p2, v0, v1

    .line 91
    .line 92
    if-gez p2, :cond_5

    .line 93
    .line 94
    cmpl-float p2, p1, v0

    .line 95
    .line 96
    if-lez p2, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, Lob5;->p()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    int-to-float p2, p2

    .line 103
    sub-float/2addr p1, p2

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    return p1

    .line 106
    :cond_6
    :goto_5
    iget p1, p0, Lob5;->f:I

    .line 107
    .line 108
    iget-object v0, p0, Lob5;->E:Led5;

    .line 109
    .line 110
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    int-to-double v6, p1

    .line 115
    const-wide v8, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    cmpg-double p1, v6, v8

    .line 121
    .line 122
    if-gez p1, :cond_7

    .line 123
    .line 124
    return v1

    .line 125
    :cond_7
    if-ne v4, p2, :cond_8

    .line 126
    .line 127
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p1, p1, Ldb5;->e:Lz75;

    .line 132
    .line 133
    if-ne p1, v2, :cond_8

    .line 134
    .line 135
    iget p1, p0, Lob5;->f:I

    .line 136
    .line 137
    neg-int p1, p1

    .line 138
    invoke-virtual {p0}, Lob5;->p()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    add-int/2addr v1, p1

    .line 143
    goto :goto_6

    .line 144
    :cond_8
    iget v1, p0, Lob5;->f:I

    .line 145
    .line 146
    :goto_6
    int-to-float p1, v1

    .line 147
    mul-float/2addr p1, v5

    .line 148
    if-ne v4, p2, :cond_a

    .line 149
    .line 150
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    iget-object p2, p2, Ldb5;->e:Lz75;

    .line 155
    .line 156
    if-ne p2, v2, :cond_a

    .line 157
    .line 158
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    check-cast p2, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_9

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_9
    invoke-virtual {p0}, Lob5;->p()I

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    :goto_7
    int-to-float p0, p0

    .line 176
    add-float/2addr p1, p0

    .line 177
    goto :goto_8

    .line 178
    :cond_a
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    check-cast p2, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_b

    .line 189
    .line 190
    invoke-virtual {p0}, Lob5;->p()I

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    goto :goto_7

    .line 195
    :cond_b
    :goto_8
    neg-float p0, p3

    .line 196
    invoke-static {p1, p0, p3}, Lz65;->o(FFF)F

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    return p0
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
