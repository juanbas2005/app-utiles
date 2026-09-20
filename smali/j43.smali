.class public final Lj43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lo81;
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final A:Ls53;

.field public final B:Ls53;

.field public final C:Ls53;

.field public final D:Liz0;

.field public final E:Lf96;

.field public final F:Ln43;

.field private volatile synthetic closed:I

.field public final w:Lq43;

.field public final x:Lfl3;

.field public final y:Le81;

.field public final z:Ls53;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lj43;

    .line 2
    .line 3
    const-string v1, "closed"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lj43;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

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
.end method

.method public constructor <init>(Lq43;Ln43;Z)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lj43;->w:Lq43;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lj43;->closed:I

    .line 11
    .line 12
    invoke-interface {p1}, Lo81;->k()Le81;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lme6;->E:Lme6;

    .line 17
    .line 18
    invoke-interface {v1, v2}, Le81;->a0(Ld81;)Lc81;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lel3;

    .line 23
    .line 24
    new-instance v3, Lfl3;

    .line 25
    .line 26
    invoke-direct {v3, v1}, Lfl3;-><init>(Lel3;)V

    .line 27
    .line 28
    .line 29
    iput-object v3, p0, Lj43;->x:Lfl3;

    .line 30
    .line 31
    invoke-interface {p1}, Lo81;->k()Le81;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1, v3}, Le81;->X(Le81;)Le81;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, Lj43;->y:Le81;

    .line 40
    .line 41
    new-instance v1, Ls53;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v1, v3}, Ls53;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lj43;->z:Ls53;

    .line 48
    .line 49
    new-instance v1, Ls53;

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    invoke-direct {v1, v3}, Ls53;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lj43;->A:Ls53;

    .line 56
    .line 57
    new-instance v1, Ls53;

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    invoke-direct {v1, v4}, Ls53;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lj43;->B:Ls53;

    .line 64
    .line 65
    new-instance v5, Ls53;

    .line 66
    .line 67
    invoke-direct {v5, v0}, Ls53;-><init>(I)V

    .line 68
    .line 69
    .line 70
    iput-object v5, p0, Lj43;->C:Ls53;

    .line 71
    .line 72
    new-instance v5, Liz0;

    .line 73
    .line 74
    invoke-direct {v5}, Liz0;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v5, p0, Lj43;->D:Liz0;

    .line 78
    .line 79
    new-instance v5, Lf96;

    .line 80
    .line 81
    const/16 v6, 0x15

    .line 82
    .line 83
    invoke-direct {v5, v6}, Lf96;-><init>(I)V

    .line 84
    .line 85
    .line 86
    iput-object v5, p0, Lj43;->E:Lf96;

    .line 87
    .line 88
    new-instance v5, Ln43;

    .line 89
    .line 90
    invoke-direct {v5}, Ln43;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v5, p0, Lj43;->F:Ln43;

    .line 94
    .line 95
    sget-object v6, Ls53;->w:Lzk2;

    .line 96
    .line 97
    new-instance v7, Lp43;

    .line 98
    .line 99
    const/4 v8, 0x0

    .line 100
    invoke-direct {v7, p0, p1, v8}, Lp43;-><init>(Lj43;Lq43;Lf61;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v6, v7}, Lxg5;->f(Lzk2;Lhs2;)V

    .line 104
    .line 105
    .line 106
    sget-object v6, Ls53;->x:Lzk2;

    .line 107
    .line 108
    new-instance v7, Lea;

    .line 109
    .line 110
    invoke-direct {v7, p0, v8, v4}, Lea;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v6, v7}, Lxg5;->f(Lzk2;Lhs2;)V

    .line 114
    .line 115
    .line 116
    sget-object v1, Lb63;->b:Lwr0;

    .line 117
    .line 118
    new-instance v4, Lvd2;

    .line 119
    .line 120
    const/16 v6, 0xf

    .line 121
    .line 122
    invoke-direct {v4, v6}, Lvd2;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v1, v4}, Ln43;->b(Ly43;Lvr2;)V

    .line 126
    .line 127
    .line 128
    sget-object v1, Lea0;->c:Lwr0;

    .line 129
    .line 130
    new-instance v4, Lvd2;

    .line 131
    .line 132
    invoke-direct {v4, v6}, Lvd2;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v1, v4}, Ln43;->b(Ly43;Lvr2;)V

    .line 136
    .line 137
    .line 138
    sget-object v1, Lhx1;->d:Lwr0;

    .line 139
    .line 140
    new-instance v4, Lvd2;

    .line 141
    .line 142
    invoke-direct {v4, v6}, Lvd2;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v1, v4}, Ln43;->b(Ly43;Lvr2;)V

    .line 146
    .line 147
    .line 148
    iget-boolean v1, p2, Ln43;->b:Z

    .line 149
    .line 150
    if-eqz v1, :cond_0

    .line 151
    .line 152
    new-instance v1, Lvd2;

    .line 153
    .line 154
    const/16 v4, 0xd

    .line 155
    .line 156
    invoke-direct {v1, v4}, Lvd2;-><init>(I)V

    .line 157
    .line 158
    .line 159
    iget-object v4, v5, Ln43;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 162
    .line 163
    const-string v7, "DefaultTransformers"

    .line 164
    .line 165
    invoke-interface {v4, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :cond_0
    sget-object v1, Lt63;->b:Ls63;

    .line 169
    .line 170
    new-instance v4, Lvd2;

    .line 171
    .line 172
    invoke-direct {v4, v6}, Lvd2;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v1, v4}, Ln43;->b(Ly43;Lvr2;)V

    .line 176
    .line 177
    .line 178
    sget-object v1, Lg43;->b:Lwr0;

    .line 179
    .line 180
    new-instance v4, Lvd2;

    .line 181
    .line 182
    invoke-direct {v4, v6}, Lvd2;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v1, v4}, Ln43;->b(Ly43;Lvr2;)V

    .line 186
    .line 187
    .line 188
    iget-boolean v4, p2, Ln43;->a:Z

    .line 189
    .line 190
    if-eqz v4, :cond_1

    .line 191
    .line 192
    sget-object v4, Lw53;->d:Lwr0;

    .line 193
    .line 194
    new-instance v7, Lvd2;

    .line 195
    .line 196
    invoke-direct {v7, v6}, Lvd2;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v4, v7}, Ln43;->b(Ly43;Lvr2;)V

    .line 200
    .line 201
    .line 202
    :cond_1
    iget-boolean v4, p2, Ln43;->a:Z

    .line 203
    .line 204
    iput-boolean v4, v5, Ln43;->a:Z

    .line 205
    .line 206
    iget-boolean v4, p2, Ln43;->b:Z

    .line 207
    .line 208
    iput-boolean v4, v5, Ln43;->b:Z

    .line 209
    .line 210
    iget-object v4, v5, Ln43;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    iget-object v7, p2, Ln43;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 217
    .line 218
    invoke-interface {v4, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 219
    .line 220
    .line 221
    iget-object v4, v5, Ln43;->d:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 224
    .line 225
    iget-object v7, p2, Ln43;->d:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 228
    .line 229
    invoke-interface {v4, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 230
    .line 231
    .line 232
    iget-object v4, v5, Ln43;->e:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 235
    .line 236
    iget-object v7, p2, Ln43;->e:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 239
    .line 240
    invoke-interface {v4, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 241
    .line 242
    .line 243
    iget-boolean p2, p2, Ln43;->b:Z

    .line 244
    .line 245
    if-eqz p2, :cond_2

    .line 246
    .line 247
    sget-object p2, Lq53;->b:Lwr0;

    .line 248
    .line 249
    new-instance v4, Lvd2;

    .line 250
    .line 251
    invoke-direct {v4, v6}, Lvd2;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, p2, v4}, Ln43;->b(Ly43;Lvr2;)V

    .line 255
    .line 256
    .line 257
    :cond_2
    sget-object p2, Lcn1;->a:Lau;

    .line 258
    .line 259
    new-instance p2, Lf81;

    .line 260
    .line 261
    invoke-direct {p2, v5}, Lf81;-><init>(Ln43;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v1, p2}, Ln43;->b(Ly43;Lvr2;)V

    .line 265
    .line 266
    .line 267
    iget-object p2, v5, Ln43;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 270
    .line 271
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    check-cast p2, Ljava/lang/Iterable;

    .line 276
    .line 277
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_3

    .line 286
    .line 287
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, Lvr2;

    .line 292
    .line 293
    invoke-interface {v1, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    goto :goto_0

    .line 297
    :cond_3
    iget-object p2, v5, Ln43;->e:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 300
    .line 301
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    check-cast p2, Ljava/lang/Iterable;

    .line 306
    .line 307
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_4

    .line 316
    .line 317
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, Lvr2;

    .line 322
    .line 323
    invoke-interface {v1, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    goto :goto_1

    .line 327
    :cond_4
    iget-object p2, p0, Lj43;->A:Ls53;

    .line 328
    .line 329
    sget-object v1, Ls53;->o:Lzk2;

    .line 330
    .line 331
    new-instance v4, Ldo1;

    .line 332
    .line 333
    invoke-direct {v4, p0, v8, v3}, Ldo1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p2, v1, v4}, Lxg5;->f(Lzk2;Lhs2;)V

    .line 337
    .line 338
    .line 339
    if-eqz p3, :cond_6

    .line 340
    .line 341
    instance-of p2, p1, Ls43;

    .line 342
    .line 343
    if-eqz p2, :cond_5

    .line 344
    .line 345
    move-object p2, p1

    .line 346
    check-cast p2, Ls43;

    .line 347
    .line 348
    sget-object p3, Ls43;->z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 349
    .line 350
    invoke-virtual {p3, p2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 351
    .line 352
    .line 353
    :cond_5
    iget-object p0, p0, Lj43;->y:Le81;

    .line 354
    .line 355
    invoke-interface {p0, v2}, Le81;->a0(Ld81;)Lc81;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    check-cast p0, Lel3;

    .line 363
    .line 364
    new-instance p2, Lh43;

    .line 365
    .line 366
    invoke-direct {p2, v0, p1}, Lh43;-><init>(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-interface {p0, p2}, Lel3;->v(Lvr2;)Lmw1;

    .line 370
    .line 371
    .line 372
    :cond_6
    return-void
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


# virtual methods
.method public final a(Ly53;Lh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Li43;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Li43;

    .line 7
    .line 8
    iget v1, v0, Li43;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Li43;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Li43;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Li43;-><init>(Lj43;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Li43;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Li43;->B:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lj43;->E:Lf96;

    .line 49
    .line 50
    sget-object v1, Lqr0;->a:Lxb4;

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Lf96;->D(Lxb4;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p1, Ly53;->d:Ljava/lang/Object;

    .line 56
    .line 57
    iput v2, v0, Li43;->B:I

    .line 58
    .line 59
    iget-object p0, p0, Lj43;->z:Ls53;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2, v0}, Lxg5;->a(Ljava/lang/Object;Ljava/lang/Object;Lh61;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object p0, Lp81;->w:Lp81;

    .line 66
    .line 67
    if-ne p2, p0, :cond_3

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_3
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast p2, Ll43;

    .line 74
    .line 75
    return-object p2
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

.method public final close()V
    .locals 10

    .line 1
    sget-object v0, Lj43;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lj43;->D:Liz0;

    .line 13
    .line 14
    sget-object v3, Lz43;->a:Lau;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Liz0;->b(Lau;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Liz0;

    .line 21
    .line 22
    invoke-virtual {v0}, Liz0;->c()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-static {v3}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_a

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lau;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v4}, Liz0;->b(Lau;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    instance-of v5, v4, Ljava/lang/AutoCloseable;

    .line 60
    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    check-cast v4, Ljava/lang/AutoCloseable;

    .line 64
    .line 65
    instance-of v5, v4, Ljava/lang/AutoCloseable;

    .line 66
    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    instance-of v5, v4, Ljava/util/concurrent/ExecutorService;

    .line 74
    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    check-cast v4, Ljava/util/concurrent/ExecutorService;

    .line 78
    .line 79
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-ne v4, v5, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_1

    .line 91
    .line 92
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 93
    .line 94
    .line 95
    move v6, v1

    .line 96
    :cond_4
    :goto_1
    if-nez v5, :cond_5

    .line 97
    .line 98
    :try_start_0
    sget-object v7, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 99
    .line 100
    const-wide/16 v8, 0x1

    .line 101
    .line 102
    invoke-interface {v4, v8, v9, v7}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 103
    .line 104
    .line 105
    move-result v5
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_1

    .line 107
    :catch_0
    if-nez v6, :cond_4

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move v6, v2

    .line 113
    goto :goto_1

    .line 114
    :cond_5
    if-eqz v6, :cond_1

    .line 115
    .line 116
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    instance-of v5, v4, Landroid/content/res/TypedArray;

    .line 125
    .line 126
    if-eqz v5, :cond_7

    .line 127
    .line 128
    check-cast v4, Landroid/content/res/TypedArray;

    .line 129
    .line 130
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    instance-of v5, v4, Landroid/media/MediaMetadataRetriever;

    .line 135
    .line 136
    if-eqz v5, :cond_8

    .line 137
    .line 138
    check-cast v4, Landroid/media/MediaMetadataRetriever;

    .line 139
    .line 140
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    instance-of v5, v4, Landroid/media/MediaDrm;

    .line 145
    .line 146
    if-eqz v5, :cond_9

    .line 147
    .line 148
    check-cast v4, Landroid/media/MediaDrm;

    .line 149
    .line 150
    invoke-virtual {v4}, Landroid/media/MediaDrm;->release()V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_9
    invoke-static {}, Lku4;->v()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_a
    iget-object p0, p0, Lj43;->x:Lfl3;

    .line 159
    .line 160
    invoke-virtual {p0}, Lfl3;->v0()V

    .line 161
    .line 162
    .line 163
    return-void
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

.method public final k()Le81;
    .locals 0

    .line 1
    iget-object p0, p0, Lj43;->y:Le81;

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
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpClient["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lj43;->w:Lq43;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x5d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

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
