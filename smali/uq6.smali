.class public abstract Luq6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lo96;

.field public static final b:Lo96;

.field public static final c:Lo96;

.field public static final d:Lo96;

.field public static final e:Lo96;

.field public static final f:Lo96;

.field public static final g:Lo96;

.field public static final h:Lo96;

.field public static final i:Lmx1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ler6;->d:Lo96;

    .line 2
    .line 3
    sput-object v0, Luq6;->a:Lo96;

    .line 4
    .line 5
    sget-object v0, Ler6;->h:Lo96;

    .line 6
    .line 7
    sput-object v0, Luq6;->b:Lo96;

    .line 8
    .line 9
    sget-object v0, Ler6;->g:Lo96;

    .line 10
    .line 11
    sput-object v0, Luq6;->c:Lo96;

    .line 12
    .line 13
    sget-object v0, Ler6;->e:Lo96;

    .line 14
    .line 15
    sput-object v0, Luq6;->d:Lo96;

    .line 16
    .line 17
    sget-object v0, Ler6;->f:Lo96;

    .line 18
    .line 19
    sput-object v0, Luq6;->e:Lo96;

    .line 20
    .line 21
    sget-object v0, Ler6;->b:Lo96;

    .line 22
    .line 23
    sput-object v0, Luq6;->f:Lo96;

    .line 24
    .line 25
    sget-object v0, Ler6;->c:Lo96;

    .line 26
    .line 27
    sput-object v0, Luq6;->g:Lo96;

    .line 28
    .line 29
    sget-object v0, Ler6;->a:Lo96;

    .line 30
    .line 31
    sput-object v0, Luq6;->h:Lo96;

    .line 32
    .line 33
    sget-object v0, Ler6;->i:Lmx1;

    .line 34
    .line 35
    sput-object v0, Luq6;->i:Lmx1;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    const/high16 v1, 0x42c80000    # 100.0f

    .line 39
    .line 40
    cmpg-float v0, v1, v0

    .line 41
    .line 42
    if-ltz v0, :cond_0

    .line 43
    .line 44
    cmpl-float v0, v1, v1

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    :cond_0
    const-string v0, "The percent should be in the range of [0, 100]"

    .line 49
    .line 50
    invoke-static {v0}, Lbc3;->a(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
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
