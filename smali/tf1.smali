.class public abstract Ltf1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lvt7;

.field public static final b:Lvt7;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lvt7;

    .line 2
    .line 3
    new-instance v1, Lzq5;

    .line 4
    .line 5
    sget-object v2, Lqf1;->D:Lqf1;

    .line 6
    .line 7
    invoke-virtual {v2}, Lti0;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v1, v2, v3}, Lzq5;-><init>(Ljr3;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x38

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/16 v3, 0x1f

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, Lvt7;-><init>(Lzq5;IILq35;I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ltf1;->a:Lvt7;

    .line 24
    .line 25
    new-instance v1, Lvt7;

    .line 26
    .line 27
    new-instance v2, Lzq5;

    .line 28
    .line 29
    sget-object v0, Lsf1;->D:Lsf1;

    .line 30
    .line 31
    invoke-virtual {v0}, Lti0;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v2, v0, v3}, Lzq5;-><init>(Ljr3;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const/16 v6, 0x38

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    const/4 v4, 0x7

    .line 43
    invoke-direct/range {v1 .. v6}, Lvt7;-><init>(Lzq5;IILq35;I)V

    .line 44
    .line 45
    .line 46
    sput-object v1, Ltf1;->b:Lvt7;

    .line 47
    .line 48
    sget v0, Lrf1;->D:I

    .line 49
    .line 50
    return-void
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
