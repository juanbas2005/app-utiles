.class public final Loq3;
.super Lyq3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnv3;
.implements Lgq3;
.implements Les3;
.implements Lxo7;


# static fields
.field public static final z:Ljava/util/HashSet;


# instance fields
.field public final x:Ljava/lang/Class;

.field public final y:Lnz3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lnz6;->a:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lgq0;

    .line 23
    .line 24
    invoke-virtual {v2}, Lgq0;->a()Lup2;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v2, v2, Lup2;->a:Lvp2;

    .line 29
    .line 30
    invoke-virtual {v2}, Lvp2;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sput-object v1, Loq3;->z:Ljava/util/HashSet;

    .line 39
    .line 40
    return-void
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

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Loq3;->x:Ljava/lang/Class;

    .line 8
    .line 9
    new-instance p1, Lhq3;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p0, v0}, Lhq3;-><init>(Loq3;I)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Li44;->w:Li44;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Loq3;->y:Lnz3;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final Y(Loq3;Lji4;Llq3;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnq3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lnq3;-><init>(Lyq3;I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x3

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p1, v2, p0}, Lt75;->n(Lji4;Lis1;I)Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Iterable;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lvj1;

    .line 38
    .line 39
    instance-of v4, v3, Lri0;

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    move-object v4, v3

    .line 44
    check-cast v4, Lri0;

    .line 45
    .line 46
    invoke-interface {v4}, Lzh4;->f()Lus1;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v6, Lvs1;->h:Lus1;

    .line 51
    .line 52
    invoke-static {v5, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    invoke-interface {v4}, Lri0;->u()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, 0x2

    .line 63
    const/4 v6, 0x1

    .line 64
    if-eq v4, v5, :cond_1

    .line 65
    .line 66
    move v4, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v4, v1

    .line 69
    :goto_1
    sget-object v5, Llq3;->w:Llq3;

    .line 70
    .line 71
    if-ne p2, v5, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move v6, v1

    .line 75
    :goto_2
    if-ne v4, v6, :cond_3

    .line 76
    .line 77
    sget-object v4, Lvs7;->a:Lvs7;

    .line 78
    .line 79
    invoke-interface {v3, v0, v4}, Lvj1;->P(Lzj1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Lvq1;

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move-object v3, v2

    .line 87
    :goto_3
    if-eqz v3, :cond_0

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-static {p1}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
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
    .line 178
    .line 179
    .line 180
    .line 181
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
.end method

.method public static Z(Lgq0;Lra6;)Lcq0;
    .locals 7

    .line 1
    new-instance v0, Lcq0;

    .line 2
    .line 3
    new-instance v1, Lc42;

    .line 4
    .line 5
    iget-object p1, p1, Lra6;->a:Lws1;

    .line 6
    .line 7
    iget-object v2, p1, Lws1;->b:Lsl4;

    .line 8
    .line 9
    iget-object v3, p0, Lgq0;->a:Lup2;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lc42;-><init>(Lsl4;Lup2;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lgq0;->f()Luq4;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object p0, p1, Lws1;->b:Lsl4;

    .line 20
    .line 21
    invoke-interface {p0}, Lsl4;->g()Lfv3;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v3, "Any"

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lfv3;->k(Ljava/lang/String;)Lql4;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lql4;->g0()Lfu6;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-object v6, p1, Lws1;->a:Lkb4;

    .line 40
    .line 41
    sget-object v3, Lfl4;->x:Lfl4;

    .line 42
    .line 43
    sget-object v4, Liq0;->w:Liq0;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v6}, Lcq0;-><init>(Lvj1;Luq4;Lfl4;Liq0;Ljava/util/List;Lkb4;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Lvs2;

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-direct {p0, v6, v0, p1}, Lvs2;-><init>(Lkb4;Lj0;I)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lg42;->w:Lg42;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {v0, p0, p1, v1}, Lcq0;->C0(Lji4;Ljava/util/Set;Lwp0;)V

    .line 58
    .line 59
    .line 60
    return-object v0
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
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    iget-object p0, p0, Lkq3;->f:Ly16;

    .line 10
    .line 11
    sget-object v0, Lkq3;->w:[Lyr3;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    return-object p0
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
.end method

.method public final L(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, Lm06;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object p0, p0, Loq3;->x:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lm06;->d:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0, p1}, Lmp7;->a0(ILjava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    sget-object v0, Lm06;->c:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Class;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object p0, v0

    .line 39
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
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

.method public final P()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, Loq3;->c0()Lql4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lql4;->l()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
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

.method public final Q()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, Loq3;->d0()Lgu3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lgu3;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    sget-object p0, La42;->w:La42;

    .line 14
    .line 15
    :cond_1
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final R(Luq4;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, Loq3;->c0()Lql4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lql4;->g0()Lfu6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lvw3;->R()Lji4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Loz4;->x:Loz4;

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lji4;->b(Luq4;Loz4;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Loq3;->c0()Lql4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lql4;->L()Lji4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, Lji4;->b(Luq4;Loz4;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v0, p0}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
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

.method public final S(I)Lcr5;
    .locals 10

    .line 1
    invoke-virtual {p0}, Loq3;->c0()Lql4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lgt1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lgt1;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, Lgt1;->A:Ltr5;

    .line 17
    .line 18
    sget-object v3, Lqp3;->h:Lyu2;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v3, p1}, Ljb5;->o(Lwu2;Lyu2;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v5, p1

    .line 28
    check-cast v5, Lqs5;

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    new-instance v4, Lfa4;

    .line 33
    .line 34
    invoke-direct {v4, p0}, Lfa4;-><init>(Lyq3;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, Lgt1;->H:Lz00;

    .line 38
    .line 39
    iget-object v1, p1, Lz00;->b:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    check-cast v6, Lvq4;

    .line 43
    .line 44
    iget-object p1, p1, Lz00;->d:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, Lwv1;

    .line 48
    .line 49
    iget-object v8, v0, Lgt1;->B:Ln80;

    .line 50
    .line 51
    sget-object v9, Lc0;->A:Lc0;

    .line 52
    .line 53
    iget-object v3, p0, Loq3;->x:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static/range {v3 .. v9}, Lg18;->g(Ljava/lang/Class;Lit1;Lwu2;Lvq4;Lwv1;Ln80;Lgs2;)Lpi0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lcr5;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    return-object v2
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

.method public final T(I)Lsu3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Loq3;->d0()Lgu3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ltf4;->w(Lgu3;)Lbo3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, Lbo3;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p0}, Ldt0;->z0(ILjava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lsu3;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final V(Luq4;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, Loq3;->c0()Lql4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lql4;->g0()Lfu6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lvw3;->R()Lji4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Loz4;->x:Loz4;

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lji4;->f(Luq4;Loz4;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Loq3;->c0()Lql4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lql4;->L()Lji4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, Lji4;->f(Luq4;Loz4;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v0, p0}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
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

.method public final a0()Lgq0;
    .locals 2

    .line 1
    sget-object v0, Lta6;->a:Lgq0;

    .line 2
    .line 3
    iget-object p0, p0, Loq3;->x:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lzo3;->b(Ljava/lang/String;)Lzo3;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Lzo3;->c()Lro5;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_0
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance p0, Lgq0;

    .line 43
    .line 44
    sget-object v0, Ln27;->k:Lup2;

    .line 45
    .line 46
    iget-object v1, v1, Lro5;->x:Luq4;

    .line 47
    .line 48
    invoke-direct {p0, v0, v1}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_1
    sget-object p0, Lm27;->g:Lvp2;

    .line 53
    .line 54
    invoke-virtual {p0}, Lvp2;->i()Lup2;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v0, Lgq0;

    .line 59
    .line 60
    invoke-virtual {p0}, Lup2;->b()Lup2;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object p0, p0, Lup2;->a:Lvp2;

    .line 65
    .line 66
    invoke-virtual {p0}, Lvp2;->g()Luq4;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v0, v1, p0}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_2
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    sget-object p0, Lta6;->a:Lgq0;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lzo3;->b(Ljava/lang/String;)Lzo3;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lzo3;->c()Lro5;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_4
    if-eqz v1, :cond_5

    .line 104
    .line 105
    new-instance p0, Lgq0;

    .line 106
    .line 107
    sget-object v0, Ln27;->k:Lup2;

    .line 108
    .line 109
    iget-object v1, v1, Lro5;->w:Luq4;

    .line 110
    .line 111
    invoke-direct {p0, v0, v1}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_5
    invoke-static {p0}, Lm06;->a(Ljava/lang/Class;)Lgq0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-boolean v0, p0, Lgq0;->c:Z

    .line 120
    .line 121
    if-nez v0, :cond_6

    .line 122
    .line 123
    sget-object v0, Ltj3;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p0}, Lgq0;->a()Lup2;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Ltj3;->g(Lup2;)Lgq0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_6
    return-object p0
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
.end method

.method public final b()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->x:Ljava/lang/Class;

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

.method public final b0()Lhq0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Loq3;->d0()Lgu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Lsu;->a(Lgu3;)Lhq0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    iget-object p0, p0, Loq3;->x:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object p0, Lhq0;->B:Lhq0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    sget-object p0, Lhq0;->y:Lhq0;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    sget-object p0, Lhq0;->z:Lhq0;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_5

    .line 53
    .line 54
    sget-object p0, Lhq0;->A:Lhq0;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_5
    sget-object p0, Lhq0;->x:Lhq0;

    .line 58
    .line 59
    return-object p0
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final c0()Lql4;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lkq3;->b()Lql4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d0()Lgu3;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lkq3;->c()Lgu3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    iget-object p0, p0, Lkq3;->k:Ly16;

    .line 10
    .line 11
    sget-object v0, Lkq3;->w:[Lyr3;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Ljava/util/List;

    .line 25
    .line 26
    return-object p0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Loq3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lkl8;->v(Lgq3;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lgq3;

    .line 10
    .line 11
    invoke-static {p1}, Lkl8;->v(Lgq3;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    iget-object p0, p0, Lkq3;->e:Ly16;

    .line 10
    .line 11
    sget-object v0, Lkq3;->w:[Lyr3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    return-object p0
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

.method public final getTypeParameters()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    iget-object p0, p0, Lkq3;->i:Ly16;

    .line 10
    .line 11
    sget-object v0, Lkq3;->w:[Lyr3;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    return-object p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lkl8;->v(Lgq3;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    iget-object p0, p0, Lkq3;->g:Ly16;

    .line 10
    .line 11
    sget-object v0, Lkq3;->w:[Lyr3;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    return-object p0
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
.end method

.method public final p()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Loq3;->d0()Lgu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Loq3;->x:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    sget-object p0, Lsu;->e:Lqc3;

    .line 30
    .line 31
    sget-object v1, Lsu;->a:[Lyr3;

    .line 32
    .line 33
    const/16 v2, 0xa

    .line 34
    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, Lqc3;->C(Lyr3;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
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

.method public final r()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, Loq3;->y:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkq3;

    .line 8
    .line 9
    iget-object p0, p0, Lkq3;->h:Ly16;

    .line 10
    .line 11
    sget-object v0, Lkq3;->w:[Lyr3;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/util/Collection;

    .line 24
    .line 25
    return-object p0
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

.method public final s()Ljava/lang/reflect/GenericDeclaration;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->x:Ljava/lang/Class;

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

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Loq3;->a0()Lgq0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lgq0;->a:Lup2;

    .line 6
    .line 7
    iget-object v1, v0, Lup2;->a:Lvp2;

    .line 8
    .line 9
    invoke-virtual {v1}, Lvp2;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x2e

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lup2;->a:Lvp2;

    .line 26
    .line 27
    iget-object v0, v0, Lvp2;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Lhl6;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iget-object p0, p0, Lgq0;->b:Lup2;

    .line 34
    .line 35
    iget-object p0, p0, Lup2;->a:Lvp2;

    .line 36
    .line 37
    iget-object p0, p0, Lvp2;->a:Ljava/lang/String;

    .line 38
    .line 39
    const/16 v1, 0x24

    .line 40
    .line 41
    invoke-static {p0, v2, v1}, Lk57;->r0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "class "

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final z()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Loq3;->d0()Lgu3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lsu;->f:Lqc3;

    .line 8
    .line 9
    sget-object v1, Lsu;->a:[Lyr3;

    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-virtual {v0, v1, p0}, Lqc3;->C(Lyr3;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-ne p0, v0, :cond_0

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
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
