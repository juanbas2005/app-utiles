.class public final La69;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lb49;


# direct methods
.method public constructor <init>(Lb49;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La69;->a:Lb49;

    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static b(Lyb9;)Lf0;
    .locals 3

    .line 1
    new-instance v0, Li49;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Li49;->D:Lyb9;

    .line 7
    .line 8
    new-instance v1, Ln49;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2, v0}, Ln49;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lfv1;->w:Lfv1;

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Lyb9;->c(Ljava/util/concurrent/Executor;Ly45;)V

    .line 17
    .line 18
    .line 19
    const-class p0, Lcom/google/android/gms/common/api/ApiException;

    .line 20
    .line 21
    sget-object v1, Ly59;->b:Ly59;

    .line 22
    .line 23
    invoke-static {v0, p0, v1, v2}, Lpt2;->a(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/Class;Ldt;Ljava/util/concurrent/Executor;)Lf0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(Lk68;)Lf0;
    .locals 6

    .line 1
    iget-object p0, p0, La69;->a:Lb49;

    .line 2
    .line 3
    const-class v0, Lf49;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lkw2;->g:Landroid/os/Looper;

    .line 10
    .line 11
    const-string v3, "Looper must not be null"

    .line 12
    .line 13
    invoke-static {v3, v2}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Luw2;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v4, Liy2;

    .line 22
    .line 23
    invoke-direct {v4, v2}, Liy2;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, v3, Luw2;->a:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v2, Lx84;

    .line 29
    .line 30
    invoke-static {v1}, Lz65;->h(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p1, v1}, Lx84;-><init>(Lk68;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, v3, Luw2;->b:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {}, Li95;->q()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    const-string p1, "__PH_INTERNAL__NO_PROCESS__"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    new-instance v4, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    add-int/2addr v1, v2

    .line 68
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, "|"

    .line 75
    .line 76
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    new-instance v0, Lfm8;

    .line 87
    .line 88
    const/4 v1, 0x5

    .line 89
    invoke-direct {v0, p0, p1, v3, v1}, Lfm8;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    sget-object p1, Lfx8;->A:Lfx8;

    .line 93
    .line 94
    new-instance v1, Lge2;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v3, v1, Lge2;->d:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v0, v1, Lge2;->b:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p1, v1, Lge2;->c:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object p1, Lmp7;->F:Lcc2;

    .line 106
    .line 107
    filled-new-array {p1}, [Lcc2;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v1, Lge2;->e:Ljava/lang/Object;

    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    iput-boolean p1, v1, Lge2;->a:Z

    .line 115
    .line 116
    iget-object v0, v1, Lge2;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Luw2;

    .line 119
    .line 120
    iget-object v0, v0, Luw2;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lx84;

    .line 123
    .line 124
    const-string v2, "Key must not be null"

    .line 125
    .line 126
    invoke-static {v2, v0}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v2, Ll90;

    .line 130
    .line 131
    iget-object v3, v1, Lge2;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Luw2;

    .line 134
    .line 135
    iget-object v4, v1, Lge2;->e:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, [Lcc2;

    .line 138
    .line 139
    iget-boolean v5, v1, Lge2;->a:Z

    .line 140
    .line 141
    invoke-direct {v2, v1, v3, v4, v5}, Ll90;-><init>(Lge2;Luw2;[Lcc2;Z)V

    .line 142
    .line 143
    .line 144
    new-instance v4, Lrg4;

    .line 145
    .line 146
    invoke-direct {v4, v1, v0}, Lrg4;-><init>(Lge2;Lx84;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, v3, Luw2;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lx84;

    .line 152
    .line 153
    const-string v1, "Listener has already been released."

    .line 154
    .line 155
    invoke-static {v1, v0}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lkw2;->k:Lpw2;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v1, Lxb7;

    .line 164
    .line 165
    invoke-direct {v1}, Lxb7;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1, p1, p0}, Lpw2;->c(Lxb7;ILkw2;)V

    .line 169
    .line 170
    .line 171
    new-instance p1, Leh8;

    .line 172
    .line 173
    new-instance v3, Lvg8;

    .line 174
    .line 175
    invoke-direct {v3, v2, v4}, Lvg8;-><init>(Ll90;Lrg4;)V

    .line 176
    .line 177
    .line 178
    invoke-direct {p1, v3, v1}, Leh8;-><init>(Lvg8;Lxb7;)V

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, Lpw2;->E:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 182
    .line 183
    new-instance v3, Lug8;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-direct {v3, p1, v2, p0}, Lug8;-><init>(Ljh8;ILkw2;)V

    .line 190
    .line 191
    .line 192
    iget-object p0, v0, Lpw2;->I:Lph8;

    .line 193
    .line 194
    const/16 p1, 0x8

    .line 195
    .line 196
    invoke-virtual {p0, p1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 201
    .line 202
    .line 203
    iget-object p0, v1, Lxb7;->a:Lyb9;

    .line 204
    .line 205
    invoke-static {p0}, La69;->b(Lyb9;)Lf0;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0
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
