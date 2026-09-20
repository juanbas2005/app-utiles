.class public final synthetic Lny1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLd06;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lny1;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lny1;->x:F

    .line 8
    .line 9
    iput-object p2, p0, Lny1;->y:Ljava/lang/Object;

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

.method public synthetic constructor <init>(Ljava/lang/Object;FI)V
    .locals 0

    .line 12
    iput p3, p0, Lny1;->w:I

    iput-object p1, p0, Lny1;->y:Ljava/lang/Object;

    iput p2, p0, Lny1;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lny1;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget v3, p0, Lny1;->x:F

    .line 6
    .line 7
    iget-object p0, p0, Lny1;->y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lmm7;

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    invoke-virtual {p0}, Lmm7;->h()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, Lmm7;->h:Lcd5;

    .line 25
    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, Lcd5;->d()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    const-wide/high16 v8, -0x8000000000000000L

    .line 33
    .line 34
    cmp-long p1, v6, v8

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v4, v5}, Lcd5;->e(J)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lmm7;->a:Lin8;

    .line 42
    .line 43
    iget-object p1, p1, Lin8;->w:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Led5;

    .line 46
    .line 47
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, v6}, Led5;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {v0}, Lcd5;->d()J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    sub-long/2addr v4, v6

    .line 57
    const/4 p1, 0x0

    .line 58
    cmpg-float p1, v3, p1

    .line 59
    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    long-to-double v4, v4

    .line 64
    float-to-double v6, v3

    .line 65
    div-double/2addr v4, v6

    .line 66
    invoke-static {v4, v5}, Ldh4;->D(D)J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    :goto_0
    invoke-virtual {p0, v4, v5}, Lmm7;->o(J)V

    .line 71
    .line 72
    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    move v1, v2

    .line 76
    :cond_2
    invoke-virtual {p0, v1, v4, v5}, Lmm7;->i(ZJ)V

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p0, Lvs7;->a:Lvs7;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_0
    check-cast p0, Lvr2;

    .line 83
    .line 84
    check-cast p1, Lgk;

    .line 85
    .line 86
    new-instance v0, Lk51;

    .line 87
    .line 88
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lk51;

    .line 93
    .line 94
    iget-object v1, v1, Lk51;->a:Ln52;

    .line 95
    .line 96
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Lk51;

    .line 101
    .line 102
    iget-object p0, p0, Lk51;->b:Lx82;

    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    invoke-direct {v0, v1, p0, v3, p1}, Lk51;-><init>(Ln52;Lx82;FLbv6;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_1
    check-cast p0, Ld06;

    .line 110
    .line 111
    check-cast p1, Lyy1;

    .line 112
    .line 113
    invoke-interface {p1}, Liv2;->O()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v4, "waiting"

    .line 118
    .line 119
    invoke-static {v0, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-interface {p1}, Lyy1;->W()Lz75;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-nez v4, :cond_5

    .line 128
    .line 129
    :cond_4
    move p1, v1

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    invoke-interface {p1}, Lyy1;->W()Lz75;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget v4, Laz1;->a:I

    .line 139
    .line 140
    sget-object v4, Lz75;->x:Lz75;

    .line 141
    .line 142
    const/high16 v5, 0x41f00000    # 30.0f

    .line 143
    .line 144
    if-ne p1, v4, :cond_6

    .line 145
    .line 146
    cmpg-float p1, v3, v5

    .line 147
    .line 148
    if-gtz p1, :cond_4

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_6
    cmpl-float p1, v3, v5

    .line 152
    .line 153
    if-lez p1, :cond_4

    .line 154
    .line 155
    const/high16 p1, 0x42b40000    # 90.0f

    .line 156
    .line 157
    cmpg-float p1, v3, p1

    .line 158
    .line 159
    if-gtz p1, :cond_4

    .line 160
    .line 161
    :goto_1
    move p1, v2

    .line 162
    :goto_2
    iget-boolean v3, p0, Ld06;->w:Z

    .line 163
    .line 164
    if-nez v3, :cond_7

    .line 165
    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    if-eqz p1, :cond_8

    .line 169
    .line 170
    :cond_7
    move v1, v2

    .line 171
    :cond_8
    iput-boolean v1, p0, Ld06;->w:Z

    .line 172
    .line 173
    xor-int/lit8 p0, v1, 0x1

    .line 174
    .line 175
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 182
    .line 183
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
.end method
