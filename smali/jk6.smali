.class public abstract Ljk6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final A:Lnk6;

.field public static final B:Lnk6;

.field public static final C:Lnk6;

.field public static final D:Lnk6;

.field public static final E:Lnk6;

.field public static final F:Lnk6;

.field public static final G:Lnk6;

.field public static final H:Lnk6;

.field public static final I:Lnk6;

.field public static final J:Lnk6;

.field public static final K:Lnk6;

.field public static final L:Lnk6;

.field public static final M:Lnk6;

.field public static final N:Lnk6;

.field public static final O:Lnk6;

.field public static final P:Lnk6;

.field public static final Q:Lnk6;

.field public static final a:Lnk6;

.field public static final b:Lnk6;

.field public static final c:Lnk6;

.field public static final d:Lnk6;

.field public static final e:Lnk6;

.field public static final f:Lnk6;

.field public static final g:Lnk6;

.field public static final h:Lnk6;

.field public static final i:Lnk6;

.field public static final j:Lnk6;

.field public static final k:Lnk6;

.field public static final l:Lnk6;

.field public static final m:Lnk6;

.field public static final n:Lnk6;

.field public static final o:Lnk6;

.field public static final p:Lnk6;

.field public static final q:Lnk6;

.field public static final r:Lnk6;

.field public static final s:Lnk6;

.field public static final t:Lnk6;

.field public static final u:Lnk6;

.field public static final v:Lnk6;

.field public static final w:Lnk6;

.field public static final x:Lnk6;

.field public static final y:Lnk6;

.field public static final z:Lnk6;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lck;->L:Lck;

    .line 2
    .line 3
    new-instance v1, Lnk6;

    .line 4
    .line 5
    const-string v2, "ContentDescription"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v1, v2, v3, v0}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Ljk6;->a:Lnk6;

    .line 12
    .line 13
    new-instance v0, Lnk6;

    .line 14
    .line 15
    const-string v1, "StateDescription"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ljk6;->b:Lnk6;

    .line 22
    .line 23
    new-instance v0, Lnk6;

    .line 24
    .line 25
    const-string v1, "ProgressBarRangeInfo"

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Ljk6;->c:Lnk6;

    .line 31
    .line 32
    sget-object v0, Lck;->T:Lck;

    .line 33
    .line 34
    new-instance v1, Lnk6;

    .line 35
    .line 36
    const-string v4, "PaneTitle"

    .line 37
    .line 38
    invoke-direct {v1, v4, v3, v0}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Ljk6;->d:Lnk6;

    .line 42
    .line 43
    new-instance v0, Lnk6;

    .line 44
    .line 45
    const-string v1, "SelectableGroup"

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Ljk6;->e:Lnk6;

    .line 51
    .line 52
    new-instance v0, Lnk6;

    .line 53
    .line 54
    const-string v1, "CollectionInfo"

    .line 55
    .line 56
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Ljk6;->f:Lnk6;

    .line 60
    .line 61
    new-instance v0, Lnk6;

    .line 62
    .line 63
    const-string v1, "CollectionItemInfo"

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Ljk6;->g:Lnk6;

    .line 69
    .line 70
    new-instance v0, Lnk6;

    .line 71
    .line 72
    const-string v1, "Heading"

    .line 73
    .line 74
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Ljk6;->h:Lnk6;

    .line 78
    .line 79
    new-instance v0, Lnk6;

    .line 80
    .line 81
    const-string v1, "TextEntryKey"

    .line 82
    .line 83
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Ljk6;->i:Lnk6;

    .line 87
    .line 88
    new-instance v0, Lnk6;

    .line 89
    .line 90
    const-string v1, "Disabled"

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Ljk6;->j:Lnk6;

    .line 96
    .line 97
    new-instance v0, Lnk6;

    .line 98
    .line 99
    const-string v1, "LiveRegion"

    .line 100
    .line 101
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    sput-object v0, Ljk6;->k:Lnk6;

    .line 105
    .line 106
    new-instance v0, Lnk6;

    .line 107
    .line 108
    const-string v1, "Focused"

    .line 109
    .line 110
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Ljk6;->l:Lnk6;

    .line 114
    .line 115
    new-instance v0, Lnk6;

    .line 116
    .line 117
    const-string v1, "IsContainer"

    .line 118
    .line 119
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    sput-object v0, Ljk6;->m:Lnk6;

    .line 123
    .line 124
    new-instance v0, Lnk6;

    .line 125
    .line 126
    const-string v1, "IsTraversalGroup"

    .line 127
    .line 128
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sput-object v0, Ljk6;->n:Lnk6;

    .line 132
    .line 133
    new-instance v0, Lnk6;

    .line 134
    .line 135
    const-string v1, "IsSensitiveData"

    .line 136
    .line 137
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    sput-object v0, Ljk6;->o:Lnk6;

    .line 141
    .line 142
    new-instance v0, Lnk6;

    .line 143
    .line 144
    const-string v1, "InvisibleToUser"

    .line 145
    .line 146
    sget-object v4, Lck;->P:Lck;

    .line 147
    .line 148
    invoke-direct {v0, v1, v4}, Lnk6;-><init>(Ljava/lang/String;Lgs2;)V

    .line 149
    .line 150
    .line 151
    sput-object v0, Ljk6;->p:Lnk6;

    .line 152
    .line 153
    new-instance v0, Lnk6;

    .line 154
    .line 155
    const-string v1, "HideFromAccessibility"

    .line 156
    .line 157
    sget-object v4, Lck;->O:Lck;

    .line 158
    .line 159
    invoke-direct {v0, v1, v4}, Lnk6;-><init>(Ljava/lang/String;Lgs2;)V

    .line 160
    .line 161
    .line 162
    sput-object v0, Ljk6;->q:Lnk6;

    .line 163
    .line 164
    new-instance v0, Lnk6;

    .line 165
    .line 166
    const-string v1, "ContentType"

    .line 167
    .line 168
    sget-object v4, Lck;->M:Lck;

    .line 169
    .line 170
    invoke-direct {v0, v1, v4}, Lnk6;-><init>(Ljava/lang/String;Lgs2;)V

    .line 171
    .line 172
    .line 173
    sput-object v0, Ljk6;->r:Lnk6;

    .line 174
    .line 175
    new-instance v0, Lnk6;

    .line 176
    .line 177
    const-string v1, "ContentDataType"

    .line 178
    .line 179
    sget-object v4, Lck;->K:Lck;

    .line 180
    .line 181
    invoke-direct {v0, v1, v4}, Lnk6;-><init>(Ljava/lang/String;Lgs2;)V

    .line 182
    .line 183
    .line 184
    sput-object v0, Ljk6;->s:Lnk6;

    .line 185
    .line 186
    new-instance v0, Lnk6;

    .line 187
    .line 188
    const-string v1, "FillableData"

    .line 189
    .line 190
    sget-object v4, Lck;->N:Lck;

    .line 191
    .line 192
    invoke-direct {v0, v1, v4}, Lnk6;-><init>(Ljava/lang/String;Lgs2;)V

    .line 193
    .line 194
    .line 195
    sput-object v0, Ljk6;->t:Lnk6;

    .line 196
    .line 197
    new-instance v0, Lnk6;

    .line 198
    .line 199
    const-string v1, "TraversalIndex"

    .line 200
    .line 201
    sget-object v4, Lck;->Y:Lck;

    .line 202
    .line 203
    invoke-direct {v0, v1, v4}, Lnk6;-><init>(Ljava/lang/String;Lgs2;)V

    .line 204
    .line 205
    .line 206
    sput-object v0, Ljk6;->u:Lnk6;

    .line 207
    .line 208
    new-instance v0, Lnk6;

    .line 209
    .line 210
    const-string v1, "HorizontalScrollAxisRange"

    .line 211
    .line 212
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 213
    .line 214
    .line 215
    sput-object v0, Ljk6;->v:Lnk6;

    .line 216
    .line 217
    new-instance v0, Lnk6;

    .line 218
    .line 219
    const-string v1, "VerticalScrollAxisRange"

    .line 220
    .line 221
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 222
    .line 223
    .line 224
    sput-object v0, Ljk6;->w:Lnk6;

    .line 225
    .line 226
    sget-object v0, Lck;->R:Lck;

    .line 227
    .line 228
    new-instance v1, Lnk6;

    .line 229
    .line 230
    const-string v4, "IsPopup"

    .line 231
    .line 232
    invoke-direct {v1, v4, v3, v0}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 233
    .line 234
    .line 235
    sput-object v1, Ljk6;->x:Lnk6;

    .line 236
    .line 237
    sget-object v0, Lck;->Q:Lck;

    .line 238
    .line 239
    new-instance v1, Lnk6;

    .line 240
    .line 241
    const-string v4, "IsDialog"

    .line 242
    .line 243
    invoke-direct {v1, v4, v3, v0}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 244
    .line 245
    .line 246
    sput-object v1, Ljk6;->y:Lnk6;

    .line 247
    .line 248
    sget-object v0, Lck;->U:Lck;

    .line 249
    .line 250
    new-instance v1, Lnk6;

    .line 251
    .line 252
    const-string v4, "Role"

    .line 253
    .line 254
    invoke-direct {v1, v4, v3, v0}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 255
    .line 256
    .line 257
    sput-object v1, Ljk6;->z:Lnk6;

    .line 258
    .line 259
    new-instance v0, Lnk6;

    .line 260
    .line 261
    const-string v1, "TestTag"

    .line 262
    .line 263
    sget-object v4, Lck;->W:Lck;

    .line 264
    .line 265
    invoke-direct {v0, v1, v2, v4}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 266
    .line 267
    .line 268
    sput-object v0, Ljk6;->A:Lnk6;

    .line 269
    .line 270
    new-instance v0, Lnk6;

    .line 271
    .line 272
    const-string v1, "LinkTestMarker"

    .line 273
    .line 274
    sget-object v4, Lck;->S:Lck;

    .line 275
    .line 276
    invoke-direct {v0, v1, v2, v4}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 277
    .line 278
    .line 279
    sput-object v0, Ljk6;->B:Lnk6;

    .line 280
    .line 281
    sget-object v0, Lck;->X:Lck;

    .line 282
    .line 283
    new-instance v1, Lnk6;

    .line 284
    .line 285
    const-string v4, "Text"

    .line 286
    .line 287
    invoke-direct {v1, v4, v3, v0}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 288
    .line 289
    .line 290
    sput-object v1, Ljk6;->C:Lnk6;

    .line 291
    .line 292
    new-instance v0, Lnk6;

    .line 293
    .line 294
    const-string v1, "TextSubstitution"

    .line 295
    .line 296
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    sput-object v0, Ljk6;->D:Lnk6;

    .line 300
    .line 301
    new-instance v0, Lnk6;

    .line 302
    .line 303
    const-string v1, "IsShowingTextSubstitution"

    .line 304
    .line 305
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    sput-object v0, Ljk6;->E:Lnk6;

    .line 309
    .line 310
    new-instance v0, Lnk6;

    .line 311
    .line 312
    const-string v1, "InputText"

    .line 313
    .line 314
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    sput-object v0, Ljk6;->F:Lnk6;

    .line 318
    .line 319
    new-instance v0, Lnk6;

    .line 320
    .line 321
    const-string v1, "EditableText"

    .line 322
    .line 323
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 324
    .line 325
    .line 326
    sput-object v0, Ljk6;->G:Lnk6;

    .line 327
    .line 328
    new-instance v0, Lnk6;

    .line 329
    .line 330
    const-string v1, "TextSelectionRange"

    .line 331
    .line 332
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 333
    .line 334
    .line 335
    sput-object v0, Ljk6;->H:Lnk6;

    .line 336
    .line 337
    new-instance v0, Lnk6;

    .line 338
    .line 339
    const-string v1, "ImeAction"

    .line 340
    .line 341
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 342
    .line 343
    .line 344
    sput-object v0, Ljk6;->I:Lnk6;

    .line 345
    .line 346
    new-instance v0, Lnk6;

    .line 347
    .line 348
    const-string v1, "Selected"

    .line 349
    .line 350
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 351
    .line 352
    .line 353
    sput-object v0, Ljk6;->J:Lnk6;

    .line 354
    .line 355
    new-instance v0, Lnk6;

    .line 356
    .line 357
    const-string v1, "ToggleableState"

    .line 358
    .line 359
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 360
    .line 361
    .line 362
    sput-object v0, Ljk6;->K:Lnk6;

    .line 363
    .line 364
    new-instance v0, Lnk6;

    .line 365
    .line 366
    const-string v1, "Password"

    .line 367
    .line 368
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 369
    .line 370
    .line 371
    sput-object v0, Ljk6;->L:Lnk6;

    .line 372
    .line 373
    new-instance v0, Lnk6;

    .line 374
    .line 375
    const-string v1, "Error"

    .line 376
    .line 377
    invoke-direct {v0, v1, v2}, Lnk6;-><init>(Ljava/lang/String;I)V

    .line 378
    .line 379
    .line 380
    sput-object v0, Ljk6;->M:Lnk6;

    .line 381
    .line 382
    new-instance v0, Lnk6;

    .line 383
    .line 384
    const-string v1, "IndexForKey"

    .line 385
    .line 386
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    sput-object v0, Ljk6;->N:Lnk6;

    .line 390
    .line 391
    new-instance v0, Lnk6;

    .line 392
    .line 393
    const-string v1, "IsEditable"

    .line 394
    .line 395
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    sput-object v0, Ljk6;->O:Lnk6;

    .line 399
    .line 400
    new-instance v0, Lnk6;

    .line 401
    .line 402
    const-string v1, "MaxTextLength"

    .line 403
    .line 404
    invoke-direct {v0, v1}, Lnk6;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    sput-object v0, Ljk6;->P:Lnk6;

    .line 408
    .line 409
    new-instance v0, Lnk6;

    .line 410
    .line 411
    const-string v1, "Shape"

    .line 412
    .line 413
    sget-object v3, Lck;->V:Lck;

    .line 414
    .line 415
    invoke-direct {v0, v1, v2, v3}, Lnk6;-><init>(Ljava/lang/String;ZLgs2;)V

    .line 416
    .line 417
    .line 418
    sput-object v0, Ljk6;->Q:Lnk6;

    .line 419
    .line 420
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method
