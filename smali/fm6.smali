.class public final Lfm6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgm6;


# direct methods
.method public synthetic constructor <init>(Lgm6;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfm6;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lfm6;->x:Lgm6;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public final k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p2, p0, Lfm6;->w:I

    .line 2
    .line 3
    sget-object v0, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lfm6;->x:Lgm6;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object p2, p1

    .line 11
    check-cast p2, Ljava/util/List;

    .line 12
    .line 13
    iget-object v1, p0, Lgm6;->e:Ld37;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v1}, Ld37;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    move-object p1, p0

    .line 20
    check-cast p1, Lis7;

    .line 21
    .line 22
    iget-object p1, p1, Lis7;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ldm6;

    .line 25
    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v3, 0xa

    .line 29
    .line 30
    invoke-static {p2, v3}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lvy7;

    .line 52
    .line 53
    new-instance v5, Lcm6;

    .line 54
    .line 55
    iget-object v6, v4, Lvy7;->b:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, v4, Lvy7;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {v5, v6, v4}, Lcm6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance p1, Ldm6;

    .line 70
    .line 71
    invoke-direct {p1, v2}, Ldm6;-><init>(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lis7;

    .line 75
    .line 76
    const/4 v3, 0x6

    .line 77
    invoke-direct {v2, v3, p1}, Lis7;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p0, v2}, Ld37;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_0

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_0
    check-cast p1, Lzn6;

    .line 88
    .line 89
    iget p1, p1, Lzn6;->f:I

    .line 90
    .line 91
    iput p1, p0, Lgm6;->g:I

    .line 92
    .line 93
    return-object v0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
